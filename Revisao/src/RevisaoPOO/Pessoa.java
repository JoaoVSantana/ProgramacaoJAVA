package RevisaoPOO;// Molde para um futuro objeto

import java.util.ArrayList;

public class Pessoa {
    // Caracteriscas ou Atributos

    private static final ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    private int idade;
    private String email;
    private String senha;
    private long cpf;
    private String nome;

    public Pessoa (String nome){
        this.nome = nome;
    }

    public Pessoa(){

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alterarSenha(String senha){
        this.senha = senha;
    }

    public static Pessoa procurarPessoa(String nome){
        for(Pessoa pessoa:listaPessoas){
            if(pessoa.nome.equals(nome)){
                return pessoa;
            }
        }
        return null;
    }
}

