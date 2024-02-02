package Biblioteca.Usuarios;

import Biblioteca.Midia;

public abstract class Funcionario extends Usuario {
    private int matricula;
    private double salario;

    public Funcionario(String nome, String usuario, String senha){
        super(nome, usuario, senha);
    }

    public abstract void cadastrarUsuario(Usuario usuario);

    public abstract void removerUsuario(Usuario usuario);

    public String consultarMidia(int codigo){
        return "";
    }

    public boolean emprestarMidia(Midia midia, Usuario usuario){
        if(!midia.isEmprestado()){
           if (usuario.adicionarEmprestimo(midia)){
               midia.alterarEmprestimo();
           }
           return true;
        }

        return false;
    }

    public boolean devolverMidia(Midia midia, Usuario usuario){

        if(usuario.emprestimos.contains(midia)) {
            usuario.emprestimos.remove(midia);
            midia.alterarEmprestimo();

            return true;
        }
        return false;
    }

    @Override
    protected boolean adicionarEmprestimo(Midia midia){
        int qtd = analiseDeMidiasEmprestadas(midia);
        if (qtd < 5){
            emprestimos.add(midia);
            return true;
        }
        return  false;
    }

}
