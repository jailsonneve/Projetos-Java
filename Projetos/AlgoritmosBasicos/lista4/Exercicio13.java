package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio13 {
    public static void main(String[] args) {
        funcoesPrincipais.imprimir("Digite um número inteiro:");
        int num = funcoesPrincipais.lerInt();

        if (num < 0) {
            funcoesPrincipais.imprimir("Valor Inválido");
            return;
        }

        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        funcoesPrincipais.imprimir("O fatorial de " + num + " é: " + fatorial);
    }
}
