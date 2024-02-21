package Biblioteca.Usuarios;

import Biblioteca.Midia;

import java.util.List;

public abstract class Funcionario extends Usuario {

    private int matricula;
    private double salario;

    public abstract void cadastrarUsuario(Usuario usuario);

    public boolean emprestarMidia(Midia midia, Usuario usuario){
        if(!midia.isEmprestada()){
            if(usuario.adicionarEmprestimo(midia)){
                midia.alterarEmprestimo();
                return true;
            }
        }
        return false;
    }

    public boolean devolverMidia(Midia midia, Usuario usuario){
        if(usuario.emprestimos.contains(midia)){
            usuario.emprestimos.remove(midia);
            midia.alterarEmprestimo();
            return true;
        }
        return false;
    }

    @Override
    protected boolean adicionarEmprestimo(Midia midia){
        int qtd = analizeDeMidiasEmprestadas(midia);
        if(qtd < 5){
            emprestimos.add(midia);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", salario=" + salario +
                '}';
    }

    public String verMidias(){
        return Midia.getMidias().toString();
    }

    public abstract void removerUsuario(Usuario usuario);

    public Funcionario(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

}