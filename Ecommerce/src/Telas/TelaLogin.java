package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txUsuario;
	private JPasswordField pfCampoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setTitle("Login da Conta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbEntreConta = new JLabel("Entre na sua Conta");
		lbEntreConta.setBounds(165, 11, 115, 14);
		contentPane.add(lbEntreConta);
		
		JLabel lbUsuario = new JLabel("Usu\u00E1rio :");
		lbUsuario.setBounds(76, 74, 58, 14);
		contentPane.add(lbUsuario);
		
		JLabel lbSenha = new JLabel("Senha :");
		lbSenha.setBounds(76, 115, 46, 14);
		contentPane.add(lbSenha);
		
		txUsuario = new JTextField();
		txUsuario.setBounds(150, 71, 126, 20);
		contentPane.add(txUsuario);
		txUsuario.setColumns(10);
		
		pfCampoSenha = new JPasswordField();
		pfCampoSenha.setBounds(150, 112, 126, 20);
		contentPane.add(pfCampoSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(165, 181, 89, 23);
		contentPane.add(btnLogar);
	}
}
