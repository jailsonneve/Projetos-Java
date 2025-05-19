/*
Classe exemplo para operadores de atribuicao composta: OperadoresAtribuicaoComposta.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

public class OperadoresAtribuicaoComposta {
    public static void main(String[] args) {
        int x = 5; //Declaração e inicialização da variável x
        
        //Operador de atribuição composta
        x += 3; // x agora é 8
        System.out.println("x = " + x); //Exibe o valor atual da variável x 
        //Operador de atribuição composta
        x -= 2; // x agora é 6
        System.out.println("x = " + x); //Exibe o valor atual da variável x 
        //Operador de atribuição composta
        x *= 4; // x agora é 24
        System.out.println("x = " + x); //Exibe o valor atual da variável x 
        //Operador de atribuição composta
        x /= 3; // x agora é 8
        System.out.println("x = " + x); //Exibe o valor atual da variável x 
        //Operador de atribuição composta
        x %= 2; // x agora é 0
        System.out.println("x = " + x); ////Exibe o valor atual da variável x 
    }
}
