package Secretaria;

public class Teste {
	
	public static void main (String[] args) {
	
	Aluno aluno1 = new Aluno("Joao");
	
	aluno1.setCpf("111.222.333-45");
	aluno1.setEmail("shaolin_matador_de_porco@gmail.com");
	aluno1.setResponsavel("Suzana");
	aluno1.setTelefone("(47)99999-9999");
	aluno1.setEndereco("Brasil, Santa Catarina, Jaraguá do Sul");
	
	Curso curso1 = new Curso("Programacao");
	
	Matricula matricula1 = new Matricula("S10101", aluno1, curso1);
	
	UnidadesCurriculares unidadeCur1 = new UnidadesCurriculares("POG" , curso1);
	
	Avaliacao avaliacao1 = new Avaliacao("Objetos" , unidadeCur1);
	
	Notas nota1 = new Notas(aluno1 , avaliacao1 , 9.5);
	
	System.out.println("Dados do Aluno:\n");
	System.out.println("Nome: " + aluno1.getNome());
	System.out.println("CPF: " + aluno1.getCpf());
	System.out.println("Email: " + aluno1.getEmail());
	System.out.println("Resposável: " + aluno1.getResponsavel());
	System.out.println("Telefone: " + aluno1.getTelefone() );
	System.out.println("Endereço: " + aluno1.getEndereco());
	System.out.println("Matrícula: " + matricula1.getCodigo());
	System.out.println("Curso: " + curso1.getNome());
	System.out.println("Unidade Curricular: " + unidadeCur1.getNome());
	System.out.println("Avaliação: " + avaliacao1.getNome());
	System.out.println("Nota: " + nota1.getNota());
	
	}

}
