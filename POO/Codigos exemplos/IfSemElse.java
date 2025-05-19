/*
Classe exemplo diretiva If sem else: IfSemElse.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 05/04/2023
*/


import javax.swing.JOptionPane;
public class IfSemElse {
	public static void main (String [] args){
		//Cria um array de objetos chamado op contendo os valores “Masculino” e “Feminino”.
		Object[] op = {"Masculino", "Feminino"}; 
		String resp = (String)JOptionPane.showInputDialog(null, 	
			"Selecione o sexo:\n", "Pesquisa", 						
			JOptionPane.PLAIN_MESSAGE, null, op, "Feminino");
		//Verifica se foi pressionado o botão Cancel da caixa de diálogo
		if (resp == null){ 
			JOptionPane.showMessageDialog(null, "Você pressionou Cancel");
		}
		//Verifica se o conteúdo da variável resp é igual a “Masculino” e mostra a mensagem de “Você é homem”.
		if (resp == "Masculino"){
			JOptionPane.showMessageDialog(null, "Você é do sexo masculino");
		}	
		//Verifica se o conteúdo da variável resp é igual a “Feminino” e mostra a mensagem de “Você é mulher”.
		if (resp == "Feminino"){
			JOptionPane.showMessageDialog(null, "Você é do sexo feminino");
		}	
		//Encerra a aplicação.
		System.exit(0);
	}
}


