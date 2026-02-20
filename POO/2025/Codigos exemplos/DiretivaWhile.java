/*
Classe exemplo diretiva while: DiretivaWhile.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 31/03/2023
*/

import java.util.Scanner; //Importa a classe Scanner, que será usada para receber entrada do usuário.

public class DiretivaWhile {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in); //Cria uma nova instância da classe Scanner
		System.out.print("Informe um valor inteiro inicial? "); //Exibe a mensagem "Valor inteiro inicial? " na saída padrão (console).
		int j = s.nextInt(); //Lê um número inteiro digitado pelo usuário usando o método nextInt() da classe Scanner e atribui o valor a variável j.
		while (j >= 0) { //Inicia um laço de repetição "while", que continuará executando enquanto o valor de j for maior ou igual a zero.
			System.out.println(j); //Exibe o valor atual de j na saída padrão, seguido de uma quebra de linha.
			j--; //Decrementa o valor de j em 1 a cada iteração do laço.
		}
	}
}



