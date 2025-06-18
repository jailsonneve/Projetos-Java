//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q2 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 02 - Senha Fixa");
        
        resolverSenhaFixa();
    }

    public static void resolverSenhaFixa(){

        // Sua solução aqui
        while (true) {
            // Entradas
            int senha = IO.lerValorInteiro();

            // Processamento e Saida
            if (senha == 2002) {
                IO.imprimir("Acesso Permitido");
                break;
            } else {
                IO.imprimir("Senha Invalida");
            }
        }
    }

}
