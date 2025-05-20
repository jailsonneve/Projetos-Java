package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio9 {
    public static void main(String[] args) {
        int qntPar = 0, qntImp = 0, cont = 0;

        funcoesPrincipais.imprimir("Digite a quantidade de números:");
        int nums = funcoesPrincipais.lerInt();

        while (cont < nums) {
            funcoesPrincipais.imprimir("Digite o número " + (cont + 1) + ":");
            int num = funcoesPrincipais.lerInt();

            if (num % 2 == 0) {
                qntPar++;
            } else {
                qntImp++;
            }

            cont++;
        }

        funcoesPrincipais.imprimir("Quantidade Par: " + qntPar);
        funcoesPrincipais.imprimir("Quantidade Ímpar: " + qntImp);
    }
}