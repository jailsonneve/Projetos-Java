/*
Classe exemplo entrada com JOptionPane: EntradaComJOptionPane.java 
IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta 
Data da criação: 21/03/2023
*/

package POO.Aula05;

import javax.swing.JOptionPane;

public class EntradaComJOptionPane {
	public static void main(String args[]) {
		String aux;
		float largura, comprimento, area, perimetro;
		try {
			aux = JOptionPane.showInputDialog("Entre com o comprimento");
			comprimento = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com a largura");
			largura = Float.parseFloat(aux);
			
			area = comprimento * largura;
			perimetro = comprimento * 2 + largura * 2;
			JOptionPane.showMessageDialog(null,"Área : " + area + ", Perímetro : " + perimetro);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null,"Houve erro na conversão, digite apenas caracteres numéricos" 
				+ erro.toString());
		}
		System.exit(0);
	}
}