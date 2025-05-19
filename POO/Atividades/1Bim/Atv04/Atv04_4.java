package Atv04;
import java.util.Scanner;
public class Atv04_4 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor do num 1: ");
        int num1 = batata.nextInt();
        System.out.println("Digite o valor do num 2: ");
        int num2 = batata.nextInt();
        System.out.println("Soma: " + (num1+num2));
        System.out.println("Produto: " + (num1*num2));
        System.out.println("Diferença: " + (num1-num2));
        System.out.println("Quociente: " + (num1/num2));
        batata.close();
    }
}