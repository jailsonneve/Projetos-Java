package Atv06;
import java.util.Scanner;
public class Atv06_04 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = batata.next().toUpperCase();
        if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")) {
            System.out.println("A letra " + letra + " é uma Vogal");
        } else {
            System.out.println("A letra " + letra + " é uma Consoante");
        }
    }
}
