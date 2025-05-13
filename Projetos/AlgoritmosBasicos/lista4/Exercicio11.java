package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio11 {
    public static void main(String[] args) {
        while (true) {
            funcoesPrincipais.imprimir("Digite um número entre 1 e 1000:");
            int num = funcoesPrincipais.lerInt();

            if (num < 1 || num > 1000) {
                funcoesPrincipais.imprimir("Tchau");
                break;
            }

            if (num % 7 == 0) {
                funcoesPrincipais.imprimir("É Múltiplo de 7");
            } else {
                funcoesPrincipais.imprimir("Não É Múltiplo de 7");
            }
        }
    }
}
