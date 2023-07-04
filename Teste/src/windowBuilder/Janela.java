package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel Fundo;
	private JTextField txNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Fundo = new JPanel();
		Fundo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Fundo);
		Fundo.setLayout(null);
		
		txNome = new JTextField();
		txNome.setBounds(143, 43, 148, 20);
		Fundo.add(txNome);
		txNome.setColumns(10);
		
		JLabel produtoNome = new JLabel("Nome :");
		produtoNome.setBounds(81, 46, 52, 14);
		Fundo.add(produtoNome);
		
		JButton BtSalvar = new JButton("Salvar");
		BtSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txNome.getText();
				JOptionPane.showMessageDialog(null, "Produto Cadastrado: " + nome);
				
			}
		});
		BtSalvar.setBounds(311, 215, 89, 23);
		Fundo.add(BtSalvar);
	}
}
