package Avaliacoes.provas.Rec2A;

import Utils.IO;

public class Q3 {
    public static void ex01(){
        int tamanho = IO.lerInt("Digite o Número de Valores: ");
        int[] valores = IO.inserirValoresVetorInt(tamanho);
        int maioresM = 0;
        int media = 0;

        for (int i = 0; i < valores.length; i++) {
            media += valores[i];
        }
        media = media/valores.length;
        
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= media) {
                maioresM++;
            }
        }

        IO.imprimirString("Quantidade de Números Maiores do que a Média: " + maioresM);
    }
}
