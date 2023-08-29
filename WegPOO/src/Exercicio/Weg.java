package Exercicio;

import java.util.ArrayList;

/**
 * Classe que representa a marca WEG e gerencia produtos e servi�os de manuten��o.
 * Os produtos e servi�os de manuten��o s�o armazenados em listas.
 * Esta classe possui m�todos para adicionar produtos e servi�os, e listar produtos dispon�veis e servi�os de manuten��o.
 * Tamb�m possui um m�todo para imprimir informa��es detalhadas dos produtos.
 * 
 * @author Joao Victor Santana
 */
public class Weg {

    private ArrayList<ProdutoWeg> produtosDisponiveis = new ArrayList<ProdutoWeg>();   // Lista de produtos dispon�veis
    private ArrayList<ServicoManutencao> servicosManutencao = new ArrayList<ServicoManutencao>(); // Lista de servi�os de manuten��o

    /**
     * Construtor da classe Weg.
     */
    public Weg() {
        // Nenhum comportamento espec�fico necess�rio no construtor
    }

    /**
     * Adiciona um produto � lista de produtos dispon�veis.
     * 
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(ProdutoWeg produto) {
        produtosDisponiveis.add(produto);
    }
    
    /**
     * Adiciona um servi�o de manuten��o � lista de servi�os.
     * 
     * @param servico O servi�o de manuten��o a ser adicionado.
     */
    public void adicionarServicoManutencao(ServicoManutencao servico) {
        servicosManutencao.add(servico);
    }
    
    /**
     * Lista os produtos dispon�veis.
     */
    public void listarProdutosDisponiveis() {
        for (ProdutoWeg produto : produtosDisponiveis) {
            System.out.println(produto.getNome());
        }
    }
    
    /**
     * Lista os servi�os de manuten��o dispon�veis.
     */
    public void listarServicosManutencao() {
        for (ServicoManutencao servico : servicosManutencao) {
            System.out.println(servico.getDescricao());
        }
    }
    
    /**
     * Imprime informa��es detalhadas dos produtos dispon�veis.
     */
    public void imprimirProdutos() {
        for (ProdutoWeg produto : produtosDisponiveis) {
            System.out.println("--------------------------------");
            produto.imprimirInformacoes();
            System.out.println("--------------------------------");
        }
    }
}
