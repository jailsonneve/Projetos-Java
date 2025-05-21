
import java.util.Scanner;
public class Atv05_1A {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor de num:");
        int num = batata.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
        batata.close();
    }    
}