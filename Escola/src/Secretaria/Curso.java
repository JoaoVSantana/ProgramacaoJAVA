package Secretaria;

/**
 * Classe para representar os cursos no sistema
 * 
 * @author João Victor Santana
 *
 */

public class Curso {

	/** Propriedade nome (String) da classe Curso */
	private String nome;
	
	/**
	 * Construtor da classe Curso
	 * 
	 * @param nome (String)
	 */
	public Curso(String nome) {
		setNome(nome);
	}
	
	/** Procedimento que recebe o nome do curso 
	 * @param nomec (String)
	 */
	public void setNome(String nomec) {
		if(nomec.matches("([A-Za-z]*)")) {
			nome = nomec;
			
		} else {
			System.out.println("Curso inválido\n");
		}
	}
	
	/** Retorna a propriedade nome do curso do objeto da classe Curso
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
}
