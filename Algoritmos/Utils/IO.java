package Utils;
import java.util.ArrayList;
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

    public static void imprimirArrayListInt(ArrayList<Integer> array) {
        for (var i : array) {
            imprimirInt(i);
        }
    }
    public static void imprimirVetorInt(int[] vetor){
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]\n");
    }
    public static void imprimirVetorFloat(float[] vetor){
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]\n");
    }
    public static void imprimirVetorDouble(double[] vetor){
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]\n");
    }
    public static void imprimirVetorString(String[] vetor){
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]\n");
    }
    public static int[] novoVetorInt(int tamVetor){
        int[] vetor;
        vetor = new int[tamVetor];
        return vetor;
    }
    public static float[] novoVetorFloat(int tamVetor){
        float[] vetor;
        vetor = new float[tamVetor];
        return vetor;
    }
    public static double[] novoVetorDouble(int tamVetor){
        double[] vetor;
        vetor = new double[tamVetor];
        return vetor;
    }
    public static String[] novoVetorString(int tamVetor){
        String[] vetor;
        vetor = new String[tamVetor];
        return vetor;
    }
    public static int[] inserirValoresVetorInt(int tamVetor){
        int[] vetorA;
        vetorA = IO.novoVetorInt(tamVetor);
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = IO.lerInt("Digite o Valor Inteiro da Posição: " + i);
        }

        return vetorA;
    }
    public static int[] subVetor(int[] vetor, int inicio, int fim) {
        // Garante que os índices estejam dentro dos limites válidos
        if (vetor == null || vetor.length == 0 || inicio >= fim || fim <= 0 || inicio >= vetor.length) {
            return novoVetorInt(0);
        }
    
        // Corrige limites para se manterem dentro dos índices válidos
        int a = Math.max(0, inicio);
        int b = Math.min(vetor.length, fim);
    
        int[] novoVetor = novoVetorInt(b - a);
        for (int i = a; i < b; i++) {
            novoVetor[i - a] = vetor[i];
        }
    
        return novoVetor;
    }
    public static int[] removerRepetidos(int[] vetor){
        
        int[] unicos = novoVetorInt(vetor.length);
        int tamanho = 0;

        for (int i = 0; i < vetor.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < tamanho; j++) {
                if (vetor[i] == unicos[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                unicos[tamanho] = vetor[i];
                tamanho++;
            }
        }

        int[] vetorRetorno = subVetor(unicos, 0, tamanho);

        return vetorRetorno;
    }
}