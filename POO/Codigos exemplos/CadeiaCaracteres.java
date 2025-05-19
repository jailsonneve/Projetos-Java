/*
Classe exemplo cadeia de caracteres: CadeiaCaracteres.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/


public class CadeiaCaracteres {
	public static void main(String args[]){
		//Declaração e inicialização de variáveis 
		String nome = "Nelson", 
		   sobrenome = " Bellincanta";
		int teste = 10;
		String nomeCompleto = nome + sobrenome;
		// Exibe string Nome completo: concatenado (+) com valor da variável nomeCompleto 
		System.out.println("Nome completo: " + nomeCompleto); 
		// Exibe string Nome completo: concatenado (+) com valor das variáveis nomeCompleto e teste 
		System.out.println("Nome completo: " + nomeCompleto + " " + teste);
		// Exibe string Tamanho String: concatenado (+) com o tamanho da variável nomeCompleto 
		System.out.println("Tamanho String: " + nomeCompleto.length());
		// Exibe o resultado da comparação das strings 
		System.out.println("Igual a Nelson Mandela: " 
		+ nomeCompleto.equals("Nelson Mandela"));
		// Exibe o resultado da comparação das strings desconsiderando letras maiúsculas e minúsculas 
		System.out.println("Igual a NELSON BELLINCANTA: " 
		+ nomeCompleto.equalsIgnoreCase("NELSON BELLINCANTA"));
	}
}



