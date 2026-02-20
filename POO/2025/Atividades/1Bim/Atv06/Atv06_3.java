
import java.util.Scanner;
public class Atv06_3 {
    public static void main(String[] args) {
        Scanner batata = new Scanner(System.in);
        System.out.println("Digite o n1 n2 e n3: ");
        int n1 = batata.nextInt();
        int n2 = batata.nextInt();
        int n3 = batata.nextInt();
        int menor, medio, maior;
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                maior = n3;
            } else {
                medio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                maior = n3;
            } else {
                medio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                maior = n2;
            } else {
                medio = n2;
                maior = n1;
            }
        }
        System.out.println("Saida em ordem: " + menor + " " + medio + " " + maior);
        batata.close();
    }
}
