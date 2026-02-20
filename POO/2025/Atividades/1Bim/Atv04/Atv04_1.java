import java.util.Scanner;

public class Atv04_1 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valorI = Integer.parseInt(batata.nextLine());
        System.out.print("Digite um valor real: ");
        float valorF = Float.parseFloat(batata.nextLine());
        System.out.println("Valor inteiro: " + valorI);
        System.out.println("Valor real: " + valorF);
        batata.close();
    }
}
