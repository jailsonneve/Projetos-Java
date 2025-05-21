
import java.util.Scanner;
public class Atv05_2D {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);

        System.out.println("Digite a quantidade de termos da série de Fibonacci:");
        int quantidadeTermos = batata.nextInt();

        System.out.println("Série de Fibonacci com " + quantidadeTermos + " termos:");
        int i = 0;
        while (i < quantidadeTermos) {
            System.out.print(calcularFibonacci(i) + " ");
            i += 1;
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
