
import java.util.Scanner;
public class Atv05_2A {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite o numero:");
        int num = batata.nextInt();
        while(contador <= 10){
            System.out.println(num + " X " + contador + " = " + num*contador);
            contador += 1;
        }
        batata.close();
    }
}