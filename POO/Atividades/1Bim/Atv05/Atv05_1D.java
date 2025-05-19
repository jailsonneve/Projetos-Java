package Atv05;
import java.util.Scanner;
public class Atv05_1D {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos da série de Fibonacci:");
        int quantidadeTermos = batata.nextInt();

        System.out.println("Série de Fibonacci com " + quantidadeTermos + " termos:");
        for (int i = 0; i < quantidadeTermos; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        batata.close();
    }

    public static int calcularFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
