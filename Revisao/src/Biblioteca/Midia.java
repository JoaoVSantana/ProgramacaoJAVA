package Biblioteca;

import java.util.ArrayList;

public abstract class Midia {

    private boolean emprestado;

    //final torna a lista em uma constante, onde voce nao pode editar os dados dela,
    //apenas apagar e colocar novos itens nela

    private static final ArrayList<Midia> midias = new ArrayList<>();

    public boolean isEmprestado() {
        return emprestado;
    }
    public void alterarEmprestimo(){
        this.emprestado = !this.emprestado;
    }
}