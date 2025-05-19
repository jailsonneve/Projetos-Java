package Atv04;

import java.util.Scanner;

public class Atv04_2 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float valorP = batata.nextFloat();
        System.out.print("Digite o valor do desconto: ");
        float porcentagem = batata.nextFloat();
        float valorD = valorP*porcentagem/100;
        float valorP2 = valorP-valorD;
        System.out.println("Valor do desconto: "+ valorD);
        System.out.println("Valor com o Desconto: "+ valorP2);
    }
}
