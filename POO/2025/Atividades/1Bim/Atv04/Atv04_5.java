import java.util.Scanner;
public class Atv04_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, result;
        System.out.println("Digite o primeiro inteiro:");
        x = input.nextInt();
        System.out.println("Digite o segundo inteiro:");
        y = input.nextInt();
        System.out.println("Digite o terceiro inteiro:");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("O valor do produto é %d%n", result);
        input.close();
    }
}