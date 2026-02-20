/*
Classe exemplo diretiva do while: DiretivaDoWhile.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 31/03/2023
*/



import java.util.Scanner; //Importa a classe Scanner, que será usada para receber entrada do usuário

public class DiretivaDoWhile {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in); //Cria uma nova instância da classe Scanner
		System.out.print("Informe o 1º valor inteiro: "); //Exibe a mensagem ao usuário
		int min = s.nextInt(); //Lê um número inteiro digitado pelo usuário usando o método nextInt() da classe Scanner
		System.out.print("Informe o segundo valor inteiro(este valor deve ser maior que o 1º valor): "); //Exibe a mensagem ao usuário
		int max = s.nextInt(); //Lê um número inteiro digitado pelo usuário usando o método nextInt() da classe Scanner
		do { //Inicia um laço de repetição "do-while"
			System.out.println(min + " < " + max); //Imprime uma string formatada contendo os valores de min e max
			min++; max--; //Incrementa o valor de min em 1 e decrementa o valor de max em 1
		} while (min < max); //Verifica a condição de continuação do laço
		System.out.println(min + " == " + max + " Condicao Final!"); //Exibe uma string formatada contendo os valores finais de min e max
	}
}

