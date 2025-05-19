package Atv04;

import java.util.Scanner;

public class Atv04_3 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor do num 1: ");
        int num1 = batata.nextInt()/3;
        System.out.println("Digite o valor do num 2: ");
        int num2 = batata.nextInt()/3;
        if (num2 >= num1) {
            System.out.println(num2-num1);
        } else {
            System.out.println(num1-num2);   
        }
        batata.close();
    }
}