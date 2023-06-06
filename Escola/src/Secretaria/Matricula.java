package Secretaria;

/**
 * Classe para representar a matricula do aluno no sistema
 * 
 * @author João Victor Santana
 *
 */

public class Matricula {

	/** Propriedade codigo (String) da classe Matricula */
	private String codigo;
	/** Propriedade aluno (Aluno) da classe Matricula */
	private Aluno aluno;
	/** Propriedade curso (Curso) da classe Matricula */
	private Curso curso;

	/**
	 * Construtor da classe Matricula
	 * 
	 * @param codigo
	 * @param aluno
	 * @param curso
	 */
	public Matricula(String codigo, Aluno aluno, Curso curso) {
		setCodigo(codigo);
		setAluno(aluno);
		setCurso(curso);
	}

	public void setCodigo(String codigom) {
		if (codigom.length() == 6 && codigom.matches("(S{1}[0-9]{5})")) {
			codigo = codigom;

		} else {
			System.out.println("Matrícula inválida\n");
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;

	}

	public Aluno getAluno() {
		return this.aluno;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;

	}

	public Curso getCurso() {
		return this.curso;
	}

}
