package Exercicio;

/**
 * Classe que representa um gerador, um tipo de produto WEG.
 * Estende a classe ProdutoWeg, herdando seus atributos e m�todos.
 * 
 * @author Joao Victor Santana
 */
public class Gerador extends ProdutoWeg {

	/**
	 * Atributos da Classe
	 */
    private String tipoCombus; // Tipo de combust�vel do gerador (ex: Diesel, Gasolina)
    private String autonomia;  // Autonomia de funcionamento do gerador

    /**
     * Construtor da classe Gerador.
     * 
     * @param nome O nome do gerador.
     * @param codigo O c�digo do gerador.
     * @param preco O pre�o do gerador.
     * @param tipoCombus O tipo de combust�vel do gerador.
     * @param autonomia A autonomia do gerador.
     */
    public Gerador(String nome, String codigo, float preco, String tipoCombus, String autonomia) {
    	super(nome, codigo, preco);
    	
    	setTipoCombus(tipoCombus);
    	setAutonomia(autonomia);
    }
    
    /**
     * Define o tipo de combust�vel do gerador.
     *
     * @param tipoCombus O tipo de combust�vel do gerador.
     */
    public void setTipoCombus(String tipoCombus) {
    	this.tipoCombus = tipoCombus;
    }
    
    /**
     * Obt�m o tipo de combust�vel do gerador.
     *
     * @return O tipo de combust�vel do gerador.
     */
    public String getTipoCombus() {
        return tipoCombus;
    }

    /**
     * Define a autonomia do gerador.
     *
     * @param autonomia A autonomia do gerador.
     */
    public void setAutonomia(String autonomia) {
    	this.autonomia = autonomia;
    }
    
    /**
     * Obt�m a autonomia do gerador.
     *
     * @return A autonomia do gerador.
     */
    public String getAutonomia() {
        return autonomia;
    }

    /**
     * Realiza uma manuten��o no gerador.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     * @return Uma mensagem indicando a manuten��o realizada.
     */
    public String realizarManutencao(ServicoManutencao servico) {
		return "Realizando manuten��o do gerador: " + servico.getDescricao();
	}
    
    /**
     * Imprime as informa��es do gerador.
     */
    public void imprimirInformacoes() {
    	System.out.println("Nome: " + getNome());
		System.out.println("Codigo:" + getCodigo());
		System.out.println("Pre�o: " + getPreco());
		System.out.println("Tipo Combust�o: " + this.tipoCombus);
		System.out.println("Autonomia: " + this.autonomia);
	}
}
