
import java.util.Scanner;
public class Atv05_2B {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int num = batata.nextInt();
        int contador = 1;
        while (num >= contador) {
            System.out.println(num);
            num -= 1;
        }
        batata.close();
    }
}