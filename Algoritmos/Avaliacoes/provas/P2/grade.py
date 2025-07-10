import subprocess
import shlex
import os

# Question weights
WEIGHTS = {
    "q0": 0, # Somar - Já resolvida
    "q1": 1.5,
    "q2": 1.5,
    "q3": 2.5,
    "q4": 2,
    "q5": 2.5,
}

CONCEITOS = {
    "D": 0.0,
    "C": 0.5,
    "B": 0.7,
    "A": 0.9,
}

grade_all = {
    "total": 0,
    }


def run(cmd, DIR):
        result = subprocess.run(shlex.split(cmd), stdout=subprocess.PIPE, stderr=subprocess.PIPE, cwd=DIR)
        return result.returncode, result.stdout.decode(), result.stderr.decode()

def get_grade_total():
    total = 0
    for question in WEIGHTS.keys():
        total += grade_all[question] * WEIGHTS[question]
    return total / sum(WEIGHTS.values())

def get_grade(percentage):

    grade = "D"  # Default grade
    for c in ["D", "C", "B", "A"]:
        if percentage >= CONCEITOS[c]:
            grade = c

    # if percentage <= 0.70:
    #     grade = "D"
    # elif percentage <= 0.80:
    #     grade = "C"
    # elif percentage <= 0.90:
    #     grade = "B"
    # else:
    #     grade = "A"

    return grade


def run_tests(question):
    global grade_all

    DIR = os.path.dirname(__file__)
    TESTS_FILE = os.path.join(DIR, f"tests/tests_{question}.txt")

    build_commands = [
        "make build",
        "make buildTest"
    ]

    with open(TESTS_FILE) as fh:
        commands = [line.strip() for line in fh if line.strip()]

    for cmd in build_commands:
        code, out, err = run(cmd, DIR)
        if code != 0:
            print(err)
            exit(1)

    passed = 0
    for cmd in commands:
        code, out, err = run(cmd, DIR)
        if code == 0:
            passed += 1
        # else:
            # print(err)

    total = len(commands)
    percentage = (passed / total)

    
    grade_all[question] = percentage

    # grade_all["total"] += WEIGHTS[question] * percentage
    


def calc_grade():
    for question in WEIGHTS.keys():
        run_tests(question)
        conceito = get_grade(grade_all[question])
        print(f"Questão {question} (peso {WEIGHTS[question]})\t: Conceito {conceito} (passou {100*grade_all[question]:.2f}%)")

    print("---")
    print(f"Conceito da avaliação\t: Conceito {get_grade(get_grade_total())} (passou {100*get_grade_total():.2f}%)")



if __name__ == "__main__":
    calc_grade()


