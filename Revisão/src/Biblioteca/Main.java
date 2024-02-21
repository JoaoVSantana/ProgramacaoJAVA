package Biblioteca;

import Biblioteca.Usuarios.Bibliotecario;
import Biblioteca.Usuarios.Cliente;
import Biblioteca.Usuarios.Funcionario;
import Biblioteca.Usuarios.Usuario;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner (System.in);
    private static Usuario usuarioLogado;

    public static void main(String[] args){
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

    private static void Login() {
        Usuario usuario = null;
        do {
            System.out.println("Usuário: ");
            Usuario usuario = sc.next();
            System.out.println("Senha: ");
            String senha = sc.next();
            usuario = Usuario.login("", "");
        }while (usuario == null);
        menuUsuario(usuario);
    }

    private static void menuUsuario(Usuario usuario) {
        do {
            System.out.println("""
                       1 - Alterar nome
                       2 - Alterar senha
                       3 - Ver empréstimos
                       4 - Ver perfil
                       5 - Consultar disponibilidade de mídia em estoque na biblioteca
                    """);
            if (usuario instanceof Funcionario) {
                System.out.println("""
                        6 - Cadastrar Cliente
                        7 - Remover usuáio
                        8 - Empréstimo de mídia
                        9 - Devolução de mídia
                        10 - Ver mídias
                        """);
                if (usuario instanceof Bibliotecario) {
                    System.out.println("""
                            11 - Cadastrar mídia
                            12 - Remover mídia
                            """);
                }
            }
            System.out.println("0 - Logout");

        } while (usuarioLogado != null);
    }

    private static void cadastroUsuario() {
        System.out.println("");
        Usuario usuario = new Cliente("","","");
        Usuario.addUsuario(usuario);
    }

    private static void logout (){
        usuarioLogado = null;
    }
}