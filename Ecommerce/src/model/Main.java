package model;

public class Main {
	 public static void main(String[] args) {

	        Cliente cliente = new Cliente("Joao");
	        cliente.setCpf("123.456.789-10");
	        cliente.setDataNascimento(10/10/2005);
//	        cliente.setEndereco("Rua Maria Madalena, 123");
	        cliente.setEmail("joaozinho@gmail.com");
//	        cliente.setSenha("Testing193!");
	        cliente.setTelefone("(47)99999-9999");
//	        cliente.setSaldo(1); 
	        
	        System.out.println("Nome: " + cliente.getNome());
	        System.out.println("Cpf: " + cliente.getCpf());
//	        System.out.println("Nascimento: " + cliente.getNascimento());
//	        System.out.println("Endereço: " + cliente.getEndereco());
	        System.out.println("Email: " + cliente.getEmail());
//	        System.out.println("Senha: " + cliente.getSenha());
	        System.out.println("Telefone: " + cliente.getTelefone());

	    }

	}
