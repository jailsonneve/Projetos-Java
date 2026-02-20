/*
Classe exemplo do uso da classe Scanner: ClassScanner.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula04;

import java.util.Scanner; //Importação da classe Scanner do pacote java.util

public class ClassScanner {
	public static void main (String args[]) {
		
        Scanner s = new Scanner(System.in); // Prepara entrada de dados

        System.out.println("Entrada formatada - Classe Scanner"); // Exibe mensagem inicial
		System.out.print("Digite um valor inteiro: "); // Mensagem de orientação
		int i = s.nextInt(); // Declaração e inicialização da variável
		System.out.println("O valor do inteiro digitado é = " + i); // Exibe valor lido
        
		s.close(); // Fecha objeto leitor
	}	
}



