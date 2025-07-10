package Aulas;

import Utils.IO;

public class Aula10 {
    
    public static void ex01(){
        int[] vetorA = {10, 11, 12, 13, 14 ,15};
        int a,b;
        a = IO.lerInt("Digite o valor de A: ");
        b = IO.lerInt("Digite o valor de B: ");

        IO.imprimirVetorInt(IO.subVetor(vetorA, a, b));
    }

}
