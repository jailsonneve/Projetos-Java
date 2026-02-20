/*
Classe para saída de dados não formatada: SaidaNaoFormatada.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula04;

public class SaidaNaoFormatada{
    public static void main(String args[]){
        int numero = 1234; //Declaração e inicialização da variável do tipo inteiro

        System.out.println("Saída Não Formatada!"); // Exibe mensagem inicial
        System.out.println(1234); // Exibe o valor inteiro 
        System.out.println(2.36); // Exibe o valor real
        System.out.println("Palavra"); // Exibe a String
        System.out.println("Uma frase com algumas palavras."); // Exibe a String  
        System.out.println(numero); // Exibe o valor da variável 
        System.out.println(numero*10 + 333); // Exibe o resultado de uma expressão 
        System.out.println("O valor: " + numero 
            + " está armazenado na variável numero."); //Exibe a concatenação de texto e o valor da variável
    }
 }



 