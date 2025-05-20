package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio5 {
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

        while (inicio < fim) {
            if (inicio % 2 == 0) {
                funcoesPrincipais.imprimir(String.valueOf(inicio));
            }
            inicio++;
        }
    }
}
