package Atv06;
import java.util.Scanner;
public class Atv06_05 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite os Lados do Triangulo");
        int lado1 = batata.nextInt();
        int lado2 = batata.nextInt();
        int lado3 = batata.nextInt();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("É um triângulo isósceles.");
        } else {
            System.out.println("É um triângulo escaleno.");
        }
    }
}
