package AlgoritmosBasicos.lista4;
import funcoes.*;
import java.math.BigInteger;

public class Exercicio17 {
    public static void main(String[] args) {
        int casa = 1;
        BigInteger graos = BigInteger.ONE;
        BigInteger totalGraos = BigInteger.ZERO;

        while (casa <= 64) {
            funcoesPrincipais.imprimir("Casa " + casa + ": " + graos + " grãos");
            totalGraos = totalGraos.add(graos);
            graos = graos.multiply(BigInteger.valueOf(2));
            casa++;
        }

        funcoesPrincipais.imprimir("Total de grãos recebidos pelo monge: " + totalGraos);
    }
}
