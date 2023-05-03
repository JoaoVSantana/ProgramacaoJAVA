package Secretaria;

public class Aluno {

	private String nome;
	private String responsavel;
	private String email;
	private int Cpf, endereço, telefone;
	private Matricula matricula;
	
	public void setNome (String pnome) {
		if(pnome.length() > 5 && pnome.matches("[A-Za-z]*") && pnome.matches("[~ ´ ^]*")) {
			nome = pnome;
			
		} else {
			System.out.println("Nome inválido");
			
		}
	}
	
	public String getNome () {
		return nome;
	}

}
