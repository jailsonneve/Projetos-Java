/*
Classe exemplo operadores relacionais: OperadoresRelacionais.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula05;


public class OperadoresRelacionais {
	public static void main (String args[]) {
		int a = 15, b = 12; // Declaração e inicialização variáveis
		System.out.println("Valores: a = " + a + ", b = " + b); //Exibe os valores das variáveis a e b
		System.out.println("a == b -> " + (a == b)); //Exibe a operação relacional igual
		System.out.println("a != b -> " + (a != b)); //Exibe a operação relacional diferente
		System.out.println("a < b -> " + (a < b)); //Exibe a operação relacional menor que
		System.out.println("a > b -> " + (a > b)); //Exibe a operação relacional maior que
		System.out.println("a <= b -> " + (a <= b)); //Exibe a operação relacional menor igual a
		System.out.println("a >= b -> " + (a >= b)); //Exibe a operação relacional maior igual a
	}
}