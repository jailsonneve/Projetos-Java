package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio6 {
    public static void main(String[] args) {
        int numero;

        funcoesPrincipais.imprimir("Digite um número inteiro maior que zero:");
        numero = funcoesPrincipais.lerInt();

        if (numero <= 0) {
            funcoesPrincipais.imprimir("Digite um valor válido");
        } else if (numero % 2 == 0) {
            funcoesPrincipais.imprimir("O número é par");
        } else {
            funcoesPrincipais.imprimir("O número é ímpar");
        }
    }
}
