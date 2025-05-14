package funcoes;
import java.util.Scanner;

public class funcoesPrincipais {
    public static Scanner batata = new Scanner(System.in);

    public static char lerChar() {
        char caracter = batata.next().charAt(0);
        return caracter;
    }

    public static String lerTexto() {
        batata.nextLine();
        String texto = batata.nextLine();
        return texto;
    }

    public static byte lerByte() {
        byte num = batata.nextByte();
        return num;
    }

    public static short lerShort() {
        short num = batata.nextShort();
        return num;
    }

    public static int lerInt() {
        int num = batata.nextInt();
        return num;
    }

    public static long lerLong() {
        long num = batata.nextLong();
        return num;
    }

    public static float lerFloat() {
        float num = batata.nextFloat();
        return num;
    }

    public static double lerDouble() {
        double num = batata.nextDouble();
        return num;
    }

    public static boolean lerBoolean() {
        boolean valor = batata.nextBoolean();
        return valor;
    }

    public static void imprimir (String texto) {
        System.out.println(texto);
    }
}