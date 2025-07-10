package Aulas;
import Utils.IO;

public class Aula11 {
    
    public static void ex01(){
        int[] original = {1, 2, 3, 1, 4, 0, 3, 9};
        int[] semDuplicatas = IO.removerRepetidos(original);


        IO.imprimirString("Original no Meu Metodo: ");
        IO.imprimirVetorInt(original);

        IO.imprimirString("Sem Valores Duplicados no Meu Metodo: ");
        IO.imprimirVetorInt(semDuplicatas);

        int[] semDuplicatas2 = removerRepetidosProf(original);


        IO.imprimirString("Original Usando o Metodo do Prof: ");
        IO.imprimirVetorInt(original);

        IO.imprimirString("Sem Valores Duplicados Usando o Metodo do Prof: ");
        IO.imprimirVetorInt(semDuplicatas2);
    }

    // Metodo do Professor Darlon

    public static int[] removerRepetidosProf(int[] vetor){
        boolean repetido;
        int cont = 0;
        int posSalvar = 0;

        for (int i = 0; i < vetor.length; i++) {
            repetido = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                cont++;
            }
        }

        int[] vetorRetorno = IO.novoVetorInt(cont);
        
        for (int i = 0; i < vetor.length; i++) {
            repetido = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                vetorRetorno[posSalvar] = vetor[i];
                posSalvar++;
            }
        }

        return vetorRetorno;
    }
}