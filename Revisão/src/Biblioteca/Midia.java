package Biblioteca;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Midia {

    public boolean emprestado;

    private static final ArrayList<Midia> midias = new ArrayList<>();

    private String nome;
    private int codigo;

    public Midia(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public boolean isEmprestada() {
        return emprestado;
    }

    public static List<Midia> getMidias() {
      return Collections.unmodifiableList(midias);
  }

    @Override
    public String toString() {
        return "Midia{" +
                "codigo=" + codigo +
                ", emprestado=" + emprestado +
                '}';
    }

    public void alterarEmprestimo(){
        this.emprestado = !this.emprestado;
    }

    public static void addMidia (Midia midia){
        midias.add(midia);
    }

    public static void removeMidia(int codigo){
        for (Midia midia : midias) {
            if (midia.codigo == codigo){
                midias.remove(midia);
                return;
            }
        }
    }

    public static Midia procurarMidia(int codigo) {
        for (Midia midia: midias) {
            if(midia.codigo == codigo){
                return midia;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

}