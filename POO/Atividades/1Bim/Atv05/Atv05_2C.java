
import java.util.Scanner;
public class Atv05_2C {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor de num:");
        int num = batata.nextInt();
        int a = 1;
        int i = 1;
        while (i < num+1) {
            a = a * i;
            i+=1;
        }
        System.out.println(a);
        batata.close();
    }    
}