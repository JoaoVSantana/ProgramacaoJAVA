package model;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class teste {

	public static void main(String[] args) {
		//Componentes:
		JLabel lbNome = new JLabel("Nome:");
		JLabel lbPreco = new JLabel("Preco:");
		JLabel lbCategoria = new JLabel("Categoria:");
		JLabel lbAvaliacao = new JLabel("Avaliação:");
		JTextField txNome = new JTextField();
		JTextField txPreco = new JTextField();
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		Object[] componentes = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategoria};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar Produto", JOptionPane.DEFAULT_OPTION);
		
	}

}
