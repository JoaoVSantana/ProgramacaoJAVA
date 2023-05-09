package Secretaria;

/** Classe para representar o Aluno no sistema
 * 
 * @author João Victor Santana
 *
 */
public class Aluno {

	private String nome, cpf;
	private String responsavel;
	private String email;
	private String endereço, telefone;
	private Matricula matricula;
	
	/**definir a variável nome
	 * 
	 * @param pnome
	 */
	public void setNome (String pnome) {
		if(pnome.length() >= 4 && pnome.matches("[A-Za-z]*")) {
			nome = pnome;
			
		} else {
			System.out.println("Nome inválido");
			
		}
	}
	
	/**puxar a variável nome
	 * 
	 * @return
	 */
	public String getNome () {
		return nome;
	}
	
	/**definir a variável Cpf
	 * 
	 * @param acpf
	 */
	public void setCpf (String acpf) {
		if(acpf.length() == 12 && acpf.matches("[0-9]*")) {
			cpf = acpf;
			
		} else {
			System.out.println("Cpf inválido");
		}
	}
	/** puxar a variável Cpf
	 * 
	 * @return
	 */
	public String getCpf () {
		return cpf;
	}
	
	/** definir a variável responsavel
	 * 
	 * @param aresponsavel
	 */
	public void setResponsavel (String aresponsavel) {
		if(aresponsavel.length() >= 4 && aresponsavel.matches("[A-Za-z]*")) {
			responsavel = aresponsavel;
			
		} else {
			System.out.println("Nome de responsável inválido");
		}
	}
	/** puxar a variável responsavel
	 * 
	 * @return
	 */
	public String getResponsavel () {
		return responsavel;
	}
	
	public void setEmail (String aemail) {
		if(aemail.matches("([a-z0-9]+[a-z0-9_\\-.]*@[a-z]+[.a-z]*)")) {
			email = aemail;
			
		} else {
			System.out.println("Email inválido");
		}
	}

	public String getEmail () {
		return email;
	}
	
	public void setTelefone(String atelefone) {
		if(atelefone.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			telefone = atelefone;
		
		} else {
			System.out.println("Telefone inválido");
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
}
