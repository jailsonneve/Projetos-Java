package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio8 {
    public static void main(String[] args) {
        int numero;
        String[] diaSemana = {
            "Domingo", "Segunda", "Terça", "Quarta",
            "Quinta", "Sexta", "Sábado"
        };

        funcoesPrincipais.imprimir("Digite um número de 1 a 7:");
        numero = funcoesPrincipais.lerInt();

        if (numero < 1 || numero > 7) {
            funcoesPrincipais.imprimir("Digite um valor válido");
        } else {
            funcoesPrincipais.imprimir("Hoje é " + diaSemana[numero - 1]);
        }
    }
}
