all: build run

FILE=AED2025_2B_Prova.java

build:
	@echo "#### $@:"
	javac -d bin Main.java
	javac -d bin questoes/$(FILE)

run:
	@java -cp bin Main

buildTest:
	javac -d bin Test.java

test_q0: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q0.txt
	@echo ok

test_q1: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q1.txt
	@echo ok

test_q2: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q2.txt
	@echo ok

test_q3: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q3.txt
	@echo ok

test_q4: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q4.txt
	@echo ok

test_q5: build buildTest
	@echo "#### $@:"
	@while IFS= read -r cmd; do \
	    $$cmd; \
	done < tests/tests_q5.txt
	@echo ok

test: test_q0 test_q1 test_q2 test_q3 test_q4 test_q5

conceito: conceitos

conceitos:
	@echo "#### $@ ####"
	@python3 grade.py
	@echo "############"