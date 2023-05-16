package Secretaria;

public class Teste {
	
	public static void main (String[] args) {
	
	Aluno aluno1 = new Aluno("Joao");
	
	aluno1.setCpf("111222333444");
	aluno1.setEmail("shaolin_matador_de_porco@gmail.com");
	aluno1.setResponsavel("Suzana");
	aluno1.setTelefone("(47)99999-9999");
	aluno1.setEndereco("Brasil, Santa Catarina, Jaraguá do Sul");
	
	Matricula matricula1 = new Matricula();
	matricula1.setMatricula("1122334455");
	
	System.out.println("Dados do Aluno:\n");
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println("Cpf: " + aluno1.getCpf());
	System.out.println("Email: " + aluno1.getEmail());
	System.out.println("Resposável: " + aluno1.getResponsavel());
	System.out.println("Telefone: " + aluno1.getTelefone() );
	System.out.println("Endereço: " + aluno1.getEndereco());
	System.out.println("Matrícula: " + matricula1.getMatricula());
	
	}

}
