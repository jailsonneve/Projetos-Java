package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio17 {
    public static void main(String[] args) {
        int casa = 1;
        long graos = 1;
        long totalGraos = 0;

        while (casa <= 64) {
            funcoesPrincipais.imprimir("Casa " + casa + ": " + graos + " grãos");
            totalGraos += graos;
            graos *= 2;
            casa++;
        }

        funcoesPrincipais.imprimir("Total de grãos recebidos pelo monge: " + totalGraos);
    }
}
