/*
Classe exemplo diretiva If com else aninhado: IfComElseAninhado.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 05/04/2023
*/

import javax.swing.*;

public class IfComElseAninhado {
	public static void main(String args[]){
		String aux = JOptionPane.showInputDialog("Forneça o número do mês");
		//Verifica se o usuário pressionou o botão Cancel da caixa de diálogo
		if (aux != null) {
			try {
				int mes = Integer.parseInt(aux);
				// se a condição mes == 1 for verdadeira, 
				//todas as condições abaixo são desprezadas 
				//e a execução do programa salta para a linha 47. 
				if (mes == 1) {
					aux = "Janeiro";
				} else if (mes == 2) {
					aux = "Fevereiro";
				} else if (mes == 3) {
					aux = "Março";
				} else if (mes == 4) {
					aux = "Abril";
				} else if (mes == 5) {
					aux = "Maio";
				} else if (mes == 6) {
					aux = "Junho";
				} else if (mes == 7) {
					aux = "Julho";
				} else if (mes == 8) {
					aux = "Agosto";
				} else if (mes == 9) {
					aux = "Setembro";
				} else if (mes == 10) {
					aux = "Outubro";
				} else if (mes == 11) {
					aux = "Novembro";
				} else if (mes == 12) {
					aux = "Dezembro";
				} else {
					aux = "Mês Desconhecido!";
				}
				JOptionPane.showMessageDialog(null, aux);
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros " + erro);
			}
		}
		//Encerra a aplicação.
		System.exit(0);
	}
}















