package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio2 {
    public static void main(String[] args) {
        int inicio = 199;
        int fim = 1;

        while (inicio > fim) {
            funcoesPrincipais.imprimir(String.valueOf(inicio));
            inicio--;
        }
    }
}
