//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q3 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 03 - Número Perfeito");

        //Entrada
        int n = IO.lerValorInteiro();


        //Processamento
        for (int i = 0; i < n; i++) {
            resolverNumeroPerfeito();
        }
        
    }

    public static void resolverNumeroPerfeito(){

        int n = IO.lerValorInteiro();
        for (int i = 0; i < n; i++) {
            
            int num = IO.lerValorInteiro();
            
            int soma = 0;
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    soma += j;
                }
            }

            // Saida
            if (soma == num) {
                
                IO.imprimir(""+num + " eh perfeito");
            } else {
                IO.imprimir(""+num + " nao eh perfeito");
            }
        }
    }

}
