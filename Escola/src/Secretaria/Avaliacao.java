package Secretaria;

/**
 * Classe para representar as avaliações no sistema
 * 
 * @author João Victor Santana
 *
 */

public class Avaliacao {

	/** Proriedade nome (String) da classe Avalicoes */
	private String nome;
	/** Proriedade unidadeCur (UnidadesCurriculares) da classe Avaliacoes */
	private UnidadesCurriculares unidadeCur;

	/**
	 * Construtor da classe Avaliacoes
	 * 
	 * @param nome (String)
	 * @param unidadeCur (UnidadesCurriculares)
	 */
	public Avaliacao(String nome, UnidadesCurriculares UnidadeCur) {
		setNome(nome);
		setUnidadesCurriculares(UnidadeCur);
	}
	/** Procedimento que recebe o nome do aluno 
	 * @param nomea (String)
	 */
	public void setNome(String nomea) {
		if (nomea.length() > 0 && nomea.matches("[A-Za-z]+")) {
			this.nome = nomea;

		} else {
			System.out.println("Nome da avaliação inválido\n");
		}
	}
	/** Retorna a propriedade nome do objeto da classe Avaliacoes
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;

	}

	/** Procedimento para validação da propriedade unidadeCur
	 * 
	 * @param unidadesC
	 */
	public void setUnidadesCurriculares(UnidadesCurriculares unidadesC) {
		this.unidadeCur = unidadesC;
				
	}
	
	/**
	 * Retorna a propriedade do objeto da classe Avaliacoes
	 * 
	 * @return unidadeCur
	 */
	public UnidadesCurriculares getUnidadesCurriculares() {
		return unidadeCur;
	}
}
