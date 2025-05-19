/*
Classe exemplo uso da classe Scanner: ClassScanner3.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula04;

import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class ClassScanner3 {
	public static void main (String args[]) {
		
        Scanner s = new Scanner(System.in); //Criação do objeto para entrada de dados

        System.out.println("Entrada formatada - Classe Scanner"); // Mensagem inicial
		
        System.out.print("Digite o 1º valor do tipo inteiro: "); // Mensagem de orientação
		int i = s.nextInt(); // Declaração e inicialização da variável
        s.nextLine(); // Limpeza da entrada após leitura de números
		System.out.println("O valor do 1º inteiro digitado é = " + i); // Exibe o valor lido
        
        System.out.print("Digite uma palavra: "); // Mensagem de orientação 
        String palavra = s.nextLine(); // Declaração e inicialização da variável
        System.out.println("A palavra digitada é  = " + palavra); // Exibe o valor lido
        
        System.out.print("Digite o 2º valor do tipo inteiro: "); //  Mensagem de orientação
        int i2 = s.nextInt(); // Declaração e inicialização da variável
        s.nextLine(); // Limpeza da entrada após leitura de números
        System.out.println("Valor = " + i2); // Exibe o valor lido

        System.out.print("Digite uma frase: "); //  Mensagem de orientação
        String frase = s.nextLine(); // Declaração e inicialização da variável
        System.out.println("A frase digitada é  = " + frase); // Exibe o valor lido

        System.out.print("Digite um valor do tipo real: "); // Mensagem de orientação 
        double d = s.nextDouble(); // Declaração e inicialização da variável
        s.nextLine(); // Limpeza da entrada após leitura de números
        System.out.println("Valor digitado = " + d); // Exibe o valor lido

        System.out.print("Digite uma 2ª palavra: "); // Mensagem de orientação 
        String palavra2 = s.nextLine(); // Declaração e inicialização da variável
        System.out.println("A 2ª palavra digitada é  = " + palavra2); // Exibe o valor lido

		s.close(); // Fecha objeto da classe Scanner
	}	
}



