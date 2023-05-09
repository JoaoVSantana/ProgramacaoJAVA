package Secretaria;

public class Teste {
	
	public static void main (String[] args) {
	
	Aluno aluno1 = new Aluno();
	aluno1.setNome("Joao"); 
	
	Aluno cpf1 = new Aluno();
	cpf1.setCpf("111222333444");
	
	Aluno email1 = new Aluno();
	email1.setEmail("shaolin_matador_de_porco@gmail.com");
	
	Aluno responsavel1 = new Aluno();
	responsavel1.setResponsavel("Suzana");
	
	Aluno telefone1 = new Aluno();
	telefone1.setTelefone("(47)99999-9999");
	
	System.out.println("Dados do Aluno:\n");
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println("Cpf: " + cpf1.getCpf());
	System.out.println("Email: " + email1.getEmail());
	System.out.println("Resposável: " + responsavel1.getResponsavel());
	System.out.println("Telefone: " + telefone1.getTelefone() );
	
	
	}

}
