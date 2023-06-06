package Secretaria;

/**
 * Classe para representar o Aluno no sistema
 * 
 * @author João Victor Santana
 *
 */
public class Aluno {
	/** Propriedade nome (String) da classe Aluno */
	private String nome;
	/** Propriedade cpf (String) da classe Aluno */  
	private String cpf;
	/** Propriedade responsavel (String), representando o nome do responsável na classe Aluno */
	private String responsavel;
	/** Propriedade email (String) da classe Aluno */
	private String email;
	/** Propriedade endereco (String) da classe Aluno */
	private String endereco;
	/** Propriedade telefone (String) da classe Aluno */
	private String telefone;

	/**
	 * Construtor que inicializa o procedimento setNome para variável nome
	 * 
	 * @param nome (String)
	 */
	public Aluno(String nome) {
		setNome(nome);
	}

	/**
	 * Sobrecarga do Construtor
	 */
	public Aluno() {

	}

	/**
	 * Procedimento para validação/alteração da propriedade nome do Aluno
	 * 
	 * @param pnome (String)
	 */
	public void setNome(String pnome) {
		if (pnome.matches("[A-Za-z\\s]+")) {
			this.nome = pnome;

		} else {
			System.out.println("Nome inválido\n");

		}
	}

	/**
	 * Retorna o nome do objeto da classe Aluno
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Procedimento para validação da propriedade Cpf do Aluno
	 * 
	 * @param acpf (String)
	 */
	public void setCpf(String acpf) {
		if (acpf.matches("([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})*")) {
			cpf = acpf;

		} else {
			System.out.println("Cpf inválido\n");
		}
	}

	/**
	 *  Retorna o Cpf do objeto da classe Aluno
	 * 
	 * @return cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Procedimento para validação da propriedade do nome do responsavel do Aluno
	 * 
	 * @param aresponsavel (String)
	 */
	public void setResponsavel(String aresponsavel) {
		if (aresponsavel.length() > 0 && aresponsavel.matches("[A-Za-z\\s]+")) {
			responsavel = aresponsavel;

		} else {
			System.out.println("Nome de responsável inválido\n");
		}
	}

	/**
	 * Retorna o  nome do responsavel do objeto da classe Aluno
	 * 
	 * @return responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}

	/** Procedimento para validação da propriedade email do Aluno
	 * 
	 * @param aemail (String)
	 */
	public void setEmail(String aemail) {
		if (aemail.matches("([a-z0-9]+[a-z0-9_\\-.]*@[a-z]+[.a-z]*)")) {
			email = aemail;

		} else {
			System.out.println("Email inválido\n");
		}
	}

	/** Retorna o email do objeto da classe Aluno 
	 * 
	 *	@return email 
	 */
	public String getEmail() {
		return email;
	}

	/** Procedimento para validação da propriedade telefone do Aluno
	 * 
	 * @param atelefone (String)
	 */
	public void setTelefone(String atelefone) {
		if (atelefone.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			telefone = atelefone;

		} else {
			System.out.println("Telefone inválido\n");
		}
	}

	/** Retorna o telefone do objeto da classe Aluno
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/** Procedimento para validação da propriedade endereço do Aluno
	 * 
	 * @param aendereco (String)
	 */
	public void setEndereco(String aendereco) {
		if (aendereco.length() > 0) {
			endereco = aendereco;

		} else {
			System.out.println("Endereço inválido\n");
		}

	}
	
	/** Retorna o endereço do objeto da classe Aluno
	 * 
	 * @param aemail (String)
	 */
	public String getEndereco() {
		return endereco;
	}
}
