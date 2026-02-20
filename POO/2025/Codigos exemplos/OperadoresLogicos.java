/*
Classe exemplo operadores lógicos: OperadoresLogicos.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula05;


public class OperadoresLogicos {
	public static void main (String args[]) {
		
        double k = 1.5, m = -1.9; 

        System.out.println("Valores: k = " + k + ", m = " + m); //Exibe os valores das variáveis k e m
        System.out.println("(k > 0) && (m < 0) -> " + ((k > 0) && (m < 0))); //Exibe a operação lógica &&
        System.out.println("(k == m) || (m > 0) -> " + ((k == m) || (m > 0))); //Exibe a operação lógica ||
        System.out.println("!(k == m) || (m > 0) -> " + !((k == m) || (m > 0))); //Exibe a operação lógica !
         
	}
}