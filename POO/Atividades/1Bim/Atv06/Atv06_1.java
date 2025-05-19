package Atv06;
import java.util.Scanner;
public class Atv06_1 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o valor total");
        int valort = batata.nextInt();
        System.out.println("Digite o tipo de cliente");
        String clieString = batata.next();
        if (clieString.equals("especial")) {
            float desc = 0.10f;
            System.out.println(valort-(valort*desc));
        } else if (clieString.equals("regular")) {
            float desc = 0.05f;
            System.out.println(valort-(valort*desc));
        }
    }
}