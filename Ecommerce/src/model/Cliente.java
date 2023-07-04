package model;

//import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {

	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String email;
	private Endereco endereco;
	private String telefone;
	private String senha;
	private Pagamento formaPagamento;
	private Double saldo;
//	ArrayList <Carrinho> carrinho = new ArrayList();

	public Cliente(String cnome) {
		setNome(cnome);
	}

	public Cliente() {

	}

	public void setNome(String cnome) {
		if (cnome != null && !cnome.isEmpty() && cnome.matches("[a-zA-Z ]+")) {
			this.nome = cnome;

		} else {
			throw new IllegalArgumentException("Nome inválido.");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String ccpf) {
		if (ccpf.matches("([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})*")) {
			this.cpf = ccpf;

		} else {
			throw new IllegalArgumentException("Cpf inválido.");
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setDataNascimento(Date cdataNascimento) {
		Calendar calendar = new GregorianCalendar();

		calendar.setTime(cdataNascimento);

		if (calendar.get(Calendar.YEAR) >= 1900 && calendar.get(Calendar.YEAR) < LocalDate.now().getYear()) {
			if (calendar.get(Calendar.MONTH) <= 12 && calendar.get(Calendar.MONTH) > 0) {
				this.dataNascimento = cdataNascimento;
			} else {
				throw new IllegalArgumentException("Data de nascimento inválida!");
			}

		} else {
			throw new IllegalArgumentException("Data de nascimento inválida!");
		}
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setEmail(String cemail) {
		if (cemail.matches("([a-z0-9]+[a-z0-9_\\.]*@[a-z]+\\.[a-z]+)")) {
			this.email = cemail;

		} else {
			throw new IllegalArgumentException("Email inválido\n");
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEndereco(Endereco cendereco) {
		this.endereco = cendereco;

	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setTelefone(String ctelefone) {
		if (ctelefone.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			telefone = ctelefone;

		} else {
			throw new IllegalArgumentException("Telefone inválido\n");
		}
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setSenha(String csenha) {
		if (csenha.matches("([A-Za-z0-9]+[!@$*&¨?|\\/]*)")) {
			this.senha = csenha;

		} else {
			throw new IllegalArgumentException("Caracteres inválidos na senha!");
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setFormaPagamento(Pagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Pagamento getFormaPagamento() {
		return this.formaPagamento;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void Cadastrar(String cnome, String csenha) {
		setNome(cnome);
		setSenha(csenha);
	}
}
