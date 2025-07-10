package Avaliacoes.provas.Rec2A;
import Utils.IO;

public class Q2 {

    public static void ex01() {
        int x, y;
        x = IO.lerInt("Digite o valor de x e y: ");
        y = IO.lerInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                IO.imprimirString("Quadrante I");
            } if (x > 0 && y < 0) {
                IO.imprimirString("Quadrante IV");
            } if (x < 0 && y < 0) {
                IO.imprimirString("Quadrante III");
            } if (x < 0 && y > 0) {
                IO.imprimirString("Quadrante II");
            }
            x = IO.lerInt("Digite o valor de x e y: ");
            y = IO.lerInt();
        }
    }

}
