package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio1 {
    public static void main(String[] args) {
        int inicio = 11;
        int fim = 200;

        while (inicio < fim) {
            funcoesPrincipais.imprimir(String.valueOf(inicio));
            inicio++;
        }
    }
}
