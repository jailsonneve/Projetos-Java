package AlgoritmosBasicos.lista4;
import funcoes.*;

public class Exercicio10 {
    public static void main(String[] args) {
        int qnt0_25 = 0, qnt26_50 = 0, qntMaior_50 = 0, cont = 0;

        funcoesPrincipais.imprimir("Digite a quantidade de números:");
        int nums = funcoesPrincipais.lerInt();

        while (cont < nums) {
            funcoesPrincipais.imprimir("Digite o número " + (cont + 1) + ":");
            int num = funcoesPrincipais.lerInt();

            if (num >= 0 && num <= 25) {
                qnt0_25++;
            } else if (num >= 26 && num <= 50) {
                qnt26_50++;
            } else if (num > 50) {
                qntMaior_50++;
            }

            cont++;
        }

        funcoesPrincipais.imprimir("Quantidade no intervalo [0..25]: " + qnt0_25);
        funcoesPrincipais.imprimir("Quantidade no intervalo [26..50]: " + qnt26_50);
        funcoesPrincipais.imprimir("Quantidade acima de 50: " + qntMaior_50);
    }
}
