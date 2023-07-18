package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import Telas.TelaCliente;
import Telas.TelaInicial;

public class Main {
	public static void main(String[] args) throws ParseException {

		TelaCliente telaCliente = new TelaCliente();
		TelaInicial telaInicial = new TelaInicial();

		telaInicial.setVisible(true);
		telaInicial.btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicial.dispose();
				telaCliente.setVisible(true);

			}
		});

	}
}
