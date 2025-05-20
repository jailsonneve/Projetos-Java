package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio14 {
    public static void main(String[] args) {
        int term1 = 0, term2 = 0, term3 = 1, cont = 1;

        while (cont <= 11) {
            if (cont == 1) {
                term1 = term3;
            } else if (cont % 2 == 0) {
                term2 = term3;
                term1 = term3;
            } else {
                term3 = term1 + term2;
            }
            cont++;
        }

        funcoesPrincipais.imprimir("O valor é: " + term3);
    }
}
