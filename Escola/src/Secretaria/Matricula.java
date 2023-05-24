package Secretaria;

public class Matricula {

	private String codigo;
	private Aluno aluno;
	private Curso curso;

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
