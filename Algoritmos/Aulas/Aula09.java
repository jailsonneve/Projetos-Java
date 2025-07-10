package Aulas;

import Utils.IO;

public class Aula09 {
    
    public static void ex01(){
        int[] vetorA = {9,8,15,2,7,6};
        double[] vetorB = {9.1,8.2,15.3,2.4};

        IO.imprimirVetorInt(vetorA);
        IO.imprimirVetorDouble(vetorB);
    }

    public static void ex02(){
        int[] vetorA;
        int tamVetor = 5;

        vetorA = IO.novoVetorInt(tamVetor);

        IO.imprimirVetorInt(vetorA);
    }

    public static void ex03(){
        int[] vetorA;
        int tamVetor = IO.lerInt("Digite o Tamanho do Vetor: ");

        vetorA = IO.novoVetorInt(tamVetor);
        IO.imprimirVetorInt(vetorA);
    }

    public static void ex04(){
        int[] vetorA;
        int tamVetor = IO.lerInt("Digite o Tamanho do Vetor: ");
        
        vetorA = IO.inserirValoresVetorInt(tamVetor);

        IO.imprimirVetorInt(vetorA);
    }
}
