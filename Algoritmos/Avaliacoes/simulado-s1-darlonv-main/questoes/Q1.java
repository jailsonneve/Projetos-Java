//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q1 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 01 - ");

        //Entrada
        int num = IO.lerValorInteiro();

        //Processamento
        resolverQuadradoEAoCubo(num);
        
    }

    public static void resolverQuadradoEAoCubo(int num){
		
        // Sua solução aqui
        int quadrado, cubo;
        StringBuilder resultado = new StringBuilder();
        IO.imprimir("1 1 1");
        for (int i = 2; i <= num; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            resultado.append(""+i + " " + ""+quadrado + " " + ""+cubo).append("\n");
        }
        // Saida
        IO.imprimir(resultado.toString());
    }

}
