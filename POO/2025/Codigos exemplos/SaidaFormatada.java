/*
Classe exemplo saída formatada com printf(): SaidaFormatada.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula04;

import java.util.Scanner; // Importação da classe Scanner do pacote java.util

public class SaidaFormatada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do objeto para entrada de dados

        System.out.println("Saída Formatada - printf()"); // Mensagem inicial
		
        System.out.print("Informe o nome da pessoa: "); // Mensagem de orientação
		String nome = sc.nextLine(); // Declaração e inicialização da variável
        System.out.print("Informe a idade da pessoa: "); // Mensagem de orientação
        int idade = sc.nextInt(); // Declaração e inicialização da variável
        System.out.print("Informe a altura da pessoa: "); // Mensagem de orientação
        double altura = sc.nextDouble(); // Declaração e inicialização da variável

        System.out.printf("%s tem %d anos e %fm de altura", nome, idade, altura); // Saída formatada com printf()
        sc.close(); // Fecha objeto da classe Scanner
    }
}