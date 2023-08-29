package Exercicio;

import java.util.ArrayList;

/**
 * Classe que representa a marca WEG e gerencia produtos e serviços de manutenção.
 * Os produtos e serviços de manutenção são armazenados em listas.
 * Esta classe possui métodos para adicionar produtos e serviços, e listar produtos disponíveis e serviços de manutenção.
 * Também possui um método para imprimir informações detalhadas dos produtos.
 * 
 * @author Joao Victor Santana
 */
public class Weg {

    private ArrayList<ProdutoWeg> produtosDisponiveis = new ArrayList<ProdutoWeg>();   // Lista de produtos disponíveis
    private ArrayList<ServicoManutencao> servicosManutencao = new ArrayList<ServicoManutencao>(); // Lista de serviços de manutenção

    /**
     * Construtor da classe Weg.
     */
    public Weg() {
        // Nenhum comportamento específico necessário no construtor
    }

    /**
     * Adiciona um produto à lista de produtos disponíveis.
     * 
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(ProdutoWeg produto) {
        produtosDisponiveis.add(produto);
    }
    
    /**
     * Adiciona um serviço de manutenção à lista de serviços.
     * 
     * @param servico O serviço de manutenção a ser adicionado.
     */
    public void adicionarServicoManutencao(ServicoManutencao servico) {
        servicosManutencao.add(servico);
    }
    
    /**
     * Lista os produtos disponíveis.
     */
    public void listarProdutosDisponiveis() {
        for (ProdutoWeg produto : produtosDisponiveis) {
            System.out.println(produto.getNome());
        }
    }
    
    /**
     * Lista os serviços de manutenção disponíveis.
     */
    public void listarServicosManutencao() {
        for (ServicoManutencao servico : servicosManutencao) {
            System.out.println(servico.getDescricao());
        }
    }
    
    /**
     * Imprime informações detalhadas dos produtos disponíveis.
     */
    public void imprimirProdutos() {
        for (ProdutoWeg produto : produtosDisponiveis) {
            System.out.println("--------------------------------");
            produto.imprimirInformacoes();
            System.out.println("--------------------------------");
        }
    }
}
