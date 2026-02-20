/*
Classe exemplo operadores aritméticos: OperadoresAritmeticos.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula05;

public class OperadoresAritmeticos {
	public static void main(String args []) {
		//declaração e inicialização de variáveis 
		int a = 10;
		int b = 3;
		int x = 0, y = 0; 

		//várias operações com as variáveis 
		System.out.println("A = " + a); // Exibe o texto entre aspas concatenado com (+) o conteúdo da variável a 
		System.out.println("Y = " + b); // Exibe o texto entre aspas concatenado com (+) o conteúdo da variável b 
		System.out.println("-A = " + (-a)); // Exibe a variável a com vaor negativo
		System.out.println("A/B = " + (a/b)); // Exibe o texto entre aspas concatenado com (+) com o resultado da expressão a/b
		System.out.println("Resto de X por Y = " + (a%b)); //Exibe o resto da divisão 
		System.out.println("Inteiro de X por Y = " + (int) (a/b)); //Exibe apenas a parte inteira do resultado da expressão

		y = ++x; // Pré-incremento: x incrementado ANTES de seu uso

		System.out.println("Valor de x = " + x + ", valor y = " + y); // Exibe x=1, y=1

		y = x++; // Pós-incremento: x incrementado DEPOIS de seu uso

		System.out.println("Valor de x = " + x + ", valor de y = " + y); // Exibe x=2, y=1
		System.out.println("Valor da expressão é: " + (64 * a - 12 * b) / 5.4321); //Exibe o valor da variável expressão
	}
}