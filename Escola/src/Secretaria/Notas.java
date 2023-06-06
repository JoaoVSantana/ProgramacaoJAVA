package Secretaria;

/**
 * Classe para representar as notas no sistema
 * 
 * @author João Victor Santana
 *
 */

public class Notas {

	/** Propriedade Aluno (Aluno) da classe Notas */
	private Aluno aluno;
	/** Propriedade Avaliacao (Avaliacao) da classe Notas */
	private Avaliacao avaliacao;
	/** Propriedade nota (double) da classe Notas */
	private double nota;

	/** Construtor da classe Notas
	 * 
	 * @param aluno (Aluno)
	 * @param avaliacao (Avaliacao)
	 * @param nota (double)
	 */
	public Notas(Aluno aluno, Avaliacao avaliacao, double nota) {
		setAluno(aluno);
		setAvaliacao(avaliacao);
		setNota(nota);
	}

	/** Procedimento que recebe o aluno no sistema 
	 * @param alunon (Aluno)
	 */
	public void setAluno(Aluno alunon) {
		this.aluno = alunon;
	}

	/** Retorna a propriedade aluno dono da nota do objeto da classe Notas
	 * 
	 * @return aluno
	 */
	public Aluno getAluno() {
		return this.aluno;
	}

	/** Procedimento que recebe a avaliação no sistema 
	 * @param avaliacaon (Avaliacao)
	 */
	public void setAvaliacao(Avaliacao avaliacaon) {
		this.avaliacao = avaliacaon;
	}

	/** Retorna a propriedade avaliacao da qual a nota pertence no objeto da classe Notas
	 * 
	 * @return avaliacao
	 */
	public Avaliacao getAvaliacao() {
		return this.avaliacao;
	}

	/** Procedimento que recebe e verifica a nota 
	 * @param notan (double)
	 * 
	 */
	public void setNota(double notan) {
		if (notan >= 0.0 && notan <= 10.0) {
			nota = notan;

		} else {
			System.out.println("Nota inválida\n");
		}
	}

	/** Retorna a propriedade nota do objeto da classe Notas
	 * 
	 * @return nota
	 */
	public double getNota() {
		return nota;
	}
}
