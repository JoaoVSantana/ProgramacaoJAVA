package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import model.Cliente;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txEmail;
	private JPasswordField PfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
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
	public TelaCliente() throws ParseException {
		setResizable(false);
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(41, 77, 46, 14);
		contentPane.add(lbNome);

		JLabel lbCpf = new JLabel("Cpf :");
		lbCpf.setBounds(41, 158, 46, 14);
		contentPane.add(lbCpf);

		JLabel lbNasc = new JLabel("Data Nasc. :");
		lbNasc.setBounds(41, 199, 69, 14);
		contentPane.add(lbNasc);

		JLabel lbTelefone = new JLabel("Telefone :");
		lbTelefone.setBounds(41, 280, 69, 14);
		contentPane.add(lbTelefone);

		JLabel lbEmail = new JLabel("Email :");
		lbEmail.setBounds(41, 239, 46, 14);
		contentPane.add(lbEmail);

		JLabel lbSenha = new JLabel("Senha :");
		lbSenha.setBounds(41, 117, 46, 14);
		contentPane.add(lbSenha);
		
		txNome = new JTextField();
		txNome.setBounds(134, 74, 174, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);

		PfSenha = new JPasswordField();
		PfSenha.setBounds(134, 114, 174, 20);
		contentPane.add(PfSenha);
		
		JFormattedTextField FtxCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		FtxCpf.setToolTipText("");
		FtxCpf.setBounds(134, 155, 174, 20);
		contentPane.add(FtxCpf);

		txEmail = new JTextField();
		txEmail.setBounds(134, 236, 174, 20);
		contentPane.add(txEmail);
		txEmail.setColumns(10);

		
		JFormattedTextField FtxData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		FtxData.setToolTipText("");
		FtxData.setBounds(134, 196, 174, 20);
		contentPane.add(FtxData);
		
		JFormattedTextField FtxTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		FtxTelefone.setBounds(134, 277, 174, 20);
		contentPane.add(FtxTelefone);

		JLabel lbCriarConta = new JLabel("Crie uma Conta");
		lbCriarConta.setForeground(Color.BLACK);
		lbCriarConta.setBounds(182, 11, 103, 14);
		contentPane.add(lbCriarConta);
		
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Cliente clienteTeste = new Cliente();
				if (clienteTeste.setNome(txNome.getText()) == 1 && clienteTeste.setCpf(FtxCpf.getText()) == 1
						&& clienteTeste.setTelefone(FtxTelefone.getText()) == 1
						&& clienteTeste.setEmail(txEmail.getText()) == 1) {

					JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
					dispose();
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Cliente não Cadastrado");
				}

			}
		});
		btCadastro.setBounds(321, 327, 103, 23);
		contentPane.add(btCadastro);

	}
}
