
import java.util.Scanner;
public class Atv05_1C {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor de num:");
        int num = batata.nextInt();
        int a = 1;
        for (int i = 1; i < num+1; i++) {
            a = a * i;
        }
        System.out.println(a);
        batata.close();
    }    
}