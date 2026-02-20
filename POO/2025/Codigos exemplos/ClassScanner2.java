/*
Classe exemplo do uso da classe Scanner: ClassScanner2.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula04;

import java.util.Scanner; // Importação da classe Scanner do pacote java.util

public class ClassScanner2 {
	public static void main (String args[]) {
		
        Scanner s = new Scanner(System.in); // Prepara entrada de dados

        System.out.println("Entrada formatada - Classe Scanner"); // Mensagem inicial
		
        System.out.print("Digite um valor inteiro: "); // Mensagem de orientação
		int i = s.nextInt(); // Declaração e inicialização da variável
		System.out.println("O valor do inteiro digitado é = " + i); // Exibe o valor lido
        
        System.out.print("Digite a uma palavra: "); // Mensagem de orientação
        String palavra = s.next(); // Declaração e inicialização da variável
        System.out.println("A palavra digitada é  = " + palavra); // Exibe valor lido

        System.out.print("Digite uma frase: "); // Mensagem de orientação
        String frase = s.nextLine(); // Declaração e inicialização da variável
        System.out.println("A frase digitada é  = " + frase); // Exibe valor lido

       
        System.out.print("Digite um valor real: "); // Mensagem de orientação
        double d = s.nextDouble(); // Declaração e inicialização da variável
        System.out.println("O Valor do tipo real digitado é = " + d); // Exibe valor lido

		s.close(); // Fecha objeto leitor
	}	
}



