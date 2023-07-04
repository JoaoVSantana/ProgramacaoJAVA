package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txNome;
	private JTextField txCpf;
	private JTextField txData;
	private JTextField txTelefone;
	private JTextField txEmail;

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
	public TelaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(34, 29, 46, 14);
		contentPane.add(lbNome);
		
		JLabel lbCpf = new JLabel("Cpf:");
		lbCpf.setBounds(34, 65, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbNasc = new JLabel("Data Nasc. :");
		lbNasc.setBounds(34, 102, 69, 14);
		contentPane.add(lbNasc);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setBounds(34, 142, 46, 14);
		contentPane.add(lbTelefone);
		
		JLabel lbEmail = new JLabel("Email:");
		lbEmail.setBounds(34, 181, 46, 14);
		contentPane.add(lbEmail);
		
		txNome = new JTextField();
		txNome.setBounds(134, 26, 174, 20);
		contentPane.add(txNome);
		txNome.setColumns(10);
		
		txCpf = new JTextField();
		txCpf.setBounds(134, 62, 174, 20);
		contentPane.add(txCpf);
		txCpf.setColumns(10);
		
		txData = new JTextField();
		txData.setBounds(134, 99, 174, 20);
		contentPane.add(txData);
		txData.setColumns(10);
		
		txTelefone = new JTextField();
		txTelefone.setBounds(134, 139, 174, 20);
		contentPane.add(txTelefone);
		txTelefone.setColumns(10);
		
		txEmail = new JTextField();
		txEmail.setBounds(134, 178, 174, 20);
		contentPane.add(txEmail);
		txEmail.setColumns(10);
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente clienteTeste = new Cliente();
				
				clienteTeste.setNome(txNome.getText());
				clienteTeste.setCpf(txCpf.getText());
				clienteTeste.setTelefone(txTelefone.getText());
				clienteTeste.setEmail(txEmail.getText());
				
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
			}
		});
		btCadastro.setBounds(321, 227, 103, 23);
		contentPane.add(btCadastro);
	}

}
