package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int inicio = 0;

        funcoesPrincipais.imprimir("Digite um valor inteiro:");
        int fim = funcoesPrincipais.lerInt();

        while (inicio < fim) {
            funcoesPrincipais.imprimir(String.valueOf(inicio));
            inicio++;
        }
    }
}
