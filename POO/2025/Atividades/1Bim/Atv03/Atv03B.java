import java.util.Scanner;
public class Atv03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        char valor = scanner.next().charAt(0);
        int asciiValor = (int) valor;
        System.out.println("O valor ASCII de '" + valor + "' é: " + asciiValor);
        scanner.close();
    }
}