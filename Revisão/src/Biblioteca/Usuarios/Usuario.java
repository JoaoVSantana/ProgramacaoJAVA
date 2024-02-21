package Biblioteca.Usuarios;

import Biblioteca.Midia;
import Biblioteca.Midias.*;

import java.util.ArrayList;

public abstract class Usuario {
    // Armazenar todos os usuarios do sistema, independente da sua tipagem especíca
    private final static ArrayList<Usuario> usuarios = new ArrayList<>();

    private String nome;
    private String usuario;
    private String senha;

    protected ArrayList<Midia> emprestimos;

    public Usuario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public void alterarSenha(String senha){
        this.senha = senha;
    }

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static Usuario login(String username, String senha){
        for(Usuario usuarioAvaliado : usuarios){
            if(usuarioAvaliado.usuario.equals(username) &&
                    usuarioAvaliado.senha.equals(senha)){
                return usuarioAvaliado;
            }
        }
        return null;
    }

    public String consultarMidia(int codigo){
        Midia midia = Midia.procurarMidia(codigo);
        if(midia == null){
            return "Mídia não encontrada";
        }
        return midia.toString();
    }

    protected int analizeDeMidiasEmprestadas(Midia midia){
        int qtd = 0;

        for(Midia midiaAnalize: emprestimos){
            if (midiaAnalize instanceof DVD && midia instanceof DVD) {
                qtd++;
            } else if (midiaAnalize instanceof Livro && midia instanceof Livro) {
                qtd++;
            } else if (midiaAnalize instanceof Revista && midia instanceof Revista) {
                qtd++;
            } else if (midiaAnalize instanceof Jornal && midia instanceof Jornal) {
                qtd++;
            }
        }
        return qtd;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", emprestimos=" + emprestimos +
                '}';
    }

    protected abstract boolean adicionarEmprestimo(Midia midia);
}