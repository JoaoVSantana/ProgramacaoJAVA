package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	public JButton btnCadastrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setResizable(false);
		setTitle("Loja do Santana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 232);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbBemVindo = new JLabel("Bem Vindo a nossa loja!");
		lbBemVindo.setBounds(153, 11, 152, 14);
		contentPane.add(lbBemVindo);

		btnCadastrar = new JButton("Cadastre-se");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCliente frame;
				try {
					frame = new TelaCliente();
					frame.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnCadastrar.setBounds(58, 126, 111, 23);
		contentPane.add(btnCadastrar);

		JButton btnFacaLogin = new JButton("Fa\u00E7a Login");
		btnFacaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin tela;

				tela = new TelaLogin();
				tela.setVisible(true);

			}
		});
		btnFacaLogin.setBounds(264, 126, 111, 23);
		contentPane.add(btnFacaLogin);

		JLabel lbPossuiCad = new JLabel("Ainda n\u00E3o possui um cadastro?");
		lbPossuiCad.setBounds(32, 101, 183, 14);
		contentPane.add(lbPossuiCad);

		JLabel lbContaEx = new JLabel("Entre em uma conta j\u00E1 existente");
		lbContaEx.setBounds(241, 101, 183, 14);
		contentPane.add(lbContaEx);
	}
}
//
