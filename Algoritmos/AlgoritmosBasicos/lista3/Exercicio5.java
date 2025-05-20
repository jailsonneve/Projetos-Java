package AlgoritmosBasicos.lista3;
import funcoes.*;
public class Exercicio5 {
    public static void main(String[] args) {
        int numero;

        funcoesPrincipais.imprimir("Digite um número inteiro:");
        numero = funcoesPrincipais.lerInt();

        if (numero == 0) {
            funcoesPrincipais.imprimir("O número é igual a: 0");
        } else if (numero > 0) {
            funcoesPrincipais.imprimir("O número é positivo");
        } else {
            funcoesPrincipais.imprimir("O número é negativo");
        }
    }
}
