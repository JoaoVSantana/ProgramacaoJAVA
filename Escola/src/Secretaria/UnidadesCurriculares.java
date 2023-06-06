package Secretaria;

/**
 * Classe para representar as unidades curriculares no sistema
 * 
 * @author João Victor Santana
 *
 */

public class UnidadesCurriculares {

	/** Propriedade nome (String) da classe UnidadesCurriculares */
	private String nome;
	/** Propriedade curso (Curso) da classe UnidadesCurriculares */
	private Curso curso;

	/** Construtor da classe UnidadesCurriculares
	 * 
	 * @param nome (String)
	 * @param curso (Curso)
	 */
	public UnidadesCurriculares(String nome, Curso curso) {
		setNome(nome);
		setCurso(curso);
	}

	/** Procedimento que recebe e verifica o nome da unidade curricular 
	 * @param unome (String)
	 */
	public void setNome(String unome) {
		if (unome.length() > 0 && unome.matches("[A-Za-z]*")) {
			this.nome = unome;

		} else {
			System.out.println("Nome da unidade curricular inválida\n");
		}
	}

	/** Retorna o nome do objeto da classe UnidadesCurriculares
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/** Procedimento que recebe e verifica o nome do curso da unidade curricular 
	 * @param curso (Curso)
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/** Retorna o curso do objeto da classe UnidadesCurriculares
	 * 
	 * @return curso
	 */
	public Curso getCurso() {
		return this.curso;
	}

}
