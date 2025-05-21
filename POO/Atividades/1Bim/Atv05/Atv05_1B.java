
import java.util.Scanner;
public class Atv05_1B {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor de num:");
        int num = batata.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
        batata.close();
    }    
}