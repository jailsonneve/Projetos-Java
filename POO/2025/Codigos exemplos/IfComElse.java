/*
Classe exemplo diretiva If com else: IfComElse.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 05/04/2023
*/

import javax.swing.*;

public class IfComElse {
	public static void main (String args[]) {
		String aux = JOptionPane.showInputDialog("Forneça o número do mês");
		//Verifica se o usuário pressionou o botão Cancel da caixa de diálogo
		if (aux != null){
			//O bloco try catch (entre as linhas 18 e 27) é o responsável por verificar se o usuário digitou um
			//valor numérico, uma vez que valores indevidos provocam erros de conversão.
			try {
				int mes = Integer.parseInt(aux);
				//instrução if responsável por verificar se o número referente ao mês, digitado
				//pelo usuário, está compreendido entre os valores 1 e 12.
				if (mes >= 1 && mes <= 12) {
					JOptionPane.showMessageDialog(null, "Número do mês válido!\n" + mes);
				} else {
					JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);
				}
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros" + erro);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operação Cancelada.");
		}
		//Encerra a aplicação.
		System.exit(0);
	}	
}

