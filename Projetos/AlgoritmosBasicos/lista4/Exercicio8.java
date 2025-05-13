package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio8 {
    public static void main(String[] args) {
        int qntP = 0, qntN = 0, cont = 0;

        funcoesPrincipais.imprimir("Digite a quantidade de números:");
        int nums = funcoesPrincipais.lerInt();

        while (cont < nums) {
            funcoesPrincipais.imprimir("Digite o número " + (cont + 1) + ":");
            int num = funcoesPrincipais.lerInt();

            if (num > 0) {
                qntP++;
            } else {
                qntN++;
            }

            cont++;
        }

        funcoesPrincipais.imprimir("Quantidade Positiva: " + qntP);
        funcoesPrincipais.imprimir("Quantidade Negativa: " + qntN);
    }
}
