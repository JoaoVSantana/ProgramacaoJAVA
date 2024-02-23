package Biblioteca;

import Biblioteca.Midias.DVD;
import Biblioteca.Midias.Jornal;
import Biblioteca.Midias.Livro;
import Biblioteca.Midias.Revista;
import Biblioteca.Usuarios.*;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner (System.in);
    private static Usuario usuarioLogado = null;

    public static void main(String[] args){

        Usuario.addUsuario(new Cliente("joao", "joaozin", "123"));
        Usuario.addUsuario(new Atendente("nicolas", "nixolas", "123"));
        Usuario.addUsuario(new Bibliotecario("daniel", "mrDaniel", "123"));
        Midia.addMidia(new Livro("Pequeno Principe", 18));
        Midia.addMidia(new DVD("Duro de Matar", 5));
        Midia.addMidia(new Jornal("Vasco campeão", 10));
        Midia.addMidia(new Revista("Forbes", 100));

        do {
            System.out.println("Bem vindo à Biblioteca!");
            System.out.println("""
                    1 - Cadastro de Usuário
                    2 - Login
                    3 - Sair
                    """);
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1 -> cadastroUsuario();
                case 2 -> Login();
                case 3 -> System.exit(0);
            }
        } while (true);
    }

    private static void menuUsuario() {
        do {
            System.out.println("""
                       1 - Alterar nome
                       2 - Alterar senha
                       3 - Ver empréstimos
                       4 - Ver perfil
                       5 - Consultar disponibilidade de mídia em estoque na biblioteca
                    """);

            if (usuarioLogado instanceof Funcionario) {
                System.out.println("""
                        6 - Cadastrar Cliente
                        7 - Remover usuáio
                        8 - Empréstimo de mídia
                        9 - Devolução de mídia
                        10 - Ver mídias
                        """);

                if (usuarioLogado instanceof Bibliotecario) {
                    System.out.println("""
                            11 - Cadastrar mídia
                            12 - Remover mídia
                            """);
                }

            }
            System.out.println("0 - Logout");

            int escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    logout();
                    break;

                case 1:
                    AlterarNome();
                    break;

                case 2:
                    AlterarSenha();
                    break;

                case 3:
                    System.out.println(usuarioLogado.getEmprestimos());
                    break;

                case 4:
                    verPerfil();
                    break;

                case 5:
                    verDisponibilidade();
                    break;

            }
            if (usuarioLogado instanceof Funcionario) {
                switch (escolha){
                    case 6:
                        cadastroUsuario();
                        break;

                    case 7:
                        removerUsuario();
                        break;

                }
            }
        } while (usuarioLogado != null);
    }


    private static void cadastroUsuario() {
        System.out.println("Digite seu primeiro Nome :");
        String nome = sc.next();
        System.out.println("Digite seu nome de usuario:");
        String usuario = sc.next();
        if(Usuario.getUsuario(usuario) != null){
            System.out.println("Nome de usuáro indisponível!");
            return;
        }
        System.out.println("Digite sua senha: ");
        String senha = sc.next();
        Usuario novoUsuario = new Cliente(nome ,usuario , senha);
        Usuario.addUsuario(novoUsuario);
    }

    private static void Login() {
        do {
            System.out.println("Usuário: ");
            String nome = sc.next();
            System.out.println("Senha: ");
            String senha = sc.next();
            usuarioLogado = Usuario.login(nome, senha);
            if (usuarioLogado == null){
                System.out.println("Usuário ou senha incorreta");
            }
        }while (usuarioLogado == null);
        menuUsuario();
    }

    private static void AlterarNome(){
        System.out.println("Digite o novo nome de usuário: ");
        String novoNome = sc.next();
        usuarioLogado.alterarNome(novoNome);
    }

    private static void AlterarSenha() {
        System.out.println("Digite a nova senha: ");
        String novaSenha = sc.next();
        usuarioLogado.alterarSenha(novaSenha);
    }

    private static void verPerfil(){
        System.out.println(usuarioLogado.toString());
    }
    private static void verDisponibilidade(){
        System.out.println("Digite o codigo da mídia: ");
        int codigo = sc.nextInt();
        if(Midia.procurarMidia(codigo) == null){
            System.out.println("Midia inexistente no sistema!");
            return;
        }
        System.out.println(usuarioLogado.consultarMidia(codigo));
    }

    private static void removerUsuario(){
        System.out.println("Digite o nome de usuário do qual deseja remover: ");
        String individuo = sc.next();

        Usuario usuarioRemovido = Usuario.getUsuario(individuo);

        if (usuarioRemovido != null){
            Usuario.removeUsuario(usuarioRemovido);
        } else {
            System.out.println("Usuário não existe");
        }
    }

    private static void logout (){
        usuarioLogado = null;
    }
}