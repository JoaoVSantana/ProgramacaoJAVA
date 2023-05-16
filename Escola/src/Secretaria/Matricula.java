package Secretaria;

public class Matricula {

	private String matricula;
	private String turma;
	private String curso;
	
	
	public void setMatricula(String matriculaa) {
		if(matriculaa.length() == 10 && matriculaa.matches("[0-9]*")) {
			matricula = matriculaa;
			
		} else {
			System.out.println("Matrícula inválida");
		}
	}
	
	public String getMatricula() {
		return matricula;
	}
	
}
