package Aulas;
import Utils.IO;

public class Aula08 {
    
    static int valorGlobal;

    public static void aula(){
        IO.imprimirString("## Aula 08 - Escopo ##");

        // valorGlobal = 10;

        // int varExemplo = 5;
        // IO.imprimirInt(varExemplo);
        // passagemValorInt(varExemplo);
        // IO.imprimirInt(varExemplo);

        // escopoLocal(15);

        int[] vetorExemplo = new int[5];
        for (int i = 0; i < vetorExemplo.length; i++) {
            vetorExemplo[i] = i;
        }
        
        IO.imprimirVetorInt(vetorExemplo);

        passagemReferencia(vetorExemplo);

        IO.imprimirVetorInt(vetorExemplo);

    }

    public static void  escopoLocal(int num){
        int valorGlobal = 2;
        
        IO.imprimirInt(num + valorGlobal);
    }

    public static void passagemValorInt(int num){
        IO.imprimirInt(num);
        num += 10;
        IO.imprimirInt(num);
    }

    public static void passagemReferencia(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] += 10;
        }
    }


}