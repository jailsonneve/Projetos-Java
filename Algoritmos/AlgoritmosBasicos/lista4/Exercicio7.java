package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio7 {
    public static void main(String[] args) {
        funcoesPrincipais.imprimir("Digite o primeiro valor:");
        int inicio = funcoesPrincipais.lerInt();

        funcoesPrincipais.imprimir("Digite o segundo valor:");
        int fim = funcoesPrincipais.lerInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        int soma = 0;

        while (inicio <= fim) {
            if (inicio % 2 == 0) {
                soma += inicio;
            }
            inicio++;
        }

        funcoesPrincipais.imprimir("Soma dos pares: " + soma);
    }
}
