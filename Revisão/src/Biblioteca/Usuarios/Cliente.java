package Biblioteca.Usuarios;

import Biblioteca.Midia;

public class Cliente extends Usuario {

    public Cliente(String nome, String usuario, String senha) {
        super(nome, usuario, senha);
    }

    @Override
    protected boolean adicionarEmprestimo(Midia midia){
        int qtd = analizeDeMidiasEmprestadas(midia);
        if(qtd < 3){
            emprestimos.add(midia);
            return true;
        }
        return false;
    }
}
