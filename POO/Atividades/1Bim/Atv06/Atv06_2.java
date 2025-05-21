
import java.util.Scanner;
public class Atv06_2 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o ano");
        int ano = batata.nextInt();
        if (ano % 4 == 0) {
            System.out.println("o ano " + ano + " é um ano Bissexto");
        } else {
            System.out.println("o ano " + ano + " não é um ano Bissexto");
        }
        batata.close();
    }    
}