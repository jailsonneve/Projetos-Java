package Utils;
import java.util.Scanner;

public class IO {
    public static Scanner batata = new Scanner(System.in);

    public static char lerChar() {
        char caracter = batata.next().charAt(0);
        return caracter;
    }

    public static char lerChar(String texto) {
        imprimirString(texto);
        char caracter = batata.next().charAt(0);
        return caracter;
    }

    public static String lerString() {
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

    public static int lerInt(String texto){
        imprimirString(texto);
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

    public static void imprimirString (String valor) {
        System.out.println(valor);
    }

    public static void imprimirInt (int valor) {
        System.out.println(valor);
    }

    public static void imprimirDouble(double valor) {
        System.out.println(valor);
    }

    public static void imprimirFloat(float valor) {
        System.out.println(valor);
    }

    public static void imprimirChar(char valor) {
        System.out.println(valor);
    }

    public static void imprimirBoolean(boolean valor) {
        System.out.println(valor);
    }

    public static void imprimirLong(long valor) {
        System.out.println(valor);
    }

    public static void imprimirShort(short valor) {
        System.out.println(valor);
    }

    public static void imprimirByte(byte valor) {
        System.out.println(valor);
    }

    public static void imprimirObjeto(Object valor) {
        System.out.println(valor);
    }

    public static void imprimirArray(Object[] array) {
        for (Object item : array) {
            System.out.println(item);
        }
    }
}
