package model;

//import java.util.ArrayList;

public class Cliente {

	private String nome;
	private String cpf;
	private String dataNascimento;
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

	public int setNome(String cnome) {
		if (cnome != null && !cnome.isEmpty() && cnome.matches("[a-zA-Z ]+")) {
			this.nome = cnome;
			return 1;

		} else {
			return 2;
		}
	}

	public String getNome() {
		return nome;
	}

	public int setCpf(String ccpf) {
		if (ccpf.matches("([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})*")) {
			this.cpf = ccpf;
			return 1;

		} else {
			return 2;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public int setDataNascimento(String cdataNascimento) {
		if(cdataNascimento.matches("([0-9/]+)")) {
			this.dataNascimento = cdataNascimento;
			return 1;
			
		} else {
			return 2;
		}
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public int setEmail(String cemail) {
		if (cemail.matches("([a-z0-9]+[a-z0-9_\\.]*@[a-z]+\\.[a-z]+)")) {
			this.email = cemail;
			return 1;

		} else {
			return 2;
		}

	}

	public String getEmail() {
		return email;
	}

	public int setEndereco(Endereco cendereco) {
		this.endereco = cendereco;
		return 1;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public int setTelefone(String ctelefone) {
		if (ctelefone.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			telefone = ctelefone;
			return 1;

		} else {
			return 2;
		}
	}

	public String getTelefone() {
		return this.telefone;
	}

	public int setSenha(String csenha) {
		if (csenha.matches("([A-Za-z0-9]+[!@$*&¨?|\\/]*)")) {
			this.senha = csenha;
			return 1;

		} else {
			return 2;
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
