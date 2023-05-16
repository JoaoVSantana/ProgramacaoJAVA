package Secretaria;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class grafico {
	public static void main (String[] args) {
		
		JLabel nome = new JLabel("Digite seu nome");
		JTextField txNome = new JTextField();
		JOptionPane.showMessageDialog(null, "Eu sou uma janela");
		Object [] componentes = {nome, txNome};
		
	}
}
