package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio11 {
    public static void main(String[] args) {
        String aluno = "";
        float nota1, nota2, nota3, media;
        String conceito;

        funcoesPrincipais.imprimir("Digite o nome do aluno:");
        aluno = funcoesPrincipais.lerTexto();

        funcoesPrincipais.imprimir("Digite a nota 1:");
        nota1 = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite a nota 2:");
        nota2 = funcoesPrincipais.lerFloat();

        funcoesPrincipais.imprimir("Digite a nota 3:");
        nota3 = funcoesPrincipais.lerFloat();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        if (media >= 90) {
            conceito = "A";
        } else if (media >= 75) {
            conceito = "B";
        } else if (media >= 60) {
            conceito = "C";
        } else if (media >= 40) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        if (conceito.equals("D") || conceito.equals("E")) {
            funcoesPrincipais.imprimir("Aluno: " + aluno + " está Reprovado!!");
        } else {
            funcoesPrincipais.imprimir("Aluno: " + aluno + " está Aprovado!!");
        }
    }
}
