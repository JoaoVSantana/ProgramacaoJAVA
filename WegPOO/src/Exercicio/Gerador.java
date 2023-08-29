package Exercicio;

/**
 * Classe que representa um gerador, um tipo de produto WEG.
 * Estende a classe ProdutoWeg, herdando seus atributos e métodos.
 * 
 * @author Joao Victor Santana
 */
public class Gerador extends ProdutoWeg {

	/**
	 * Atributos da Classe
	 */
    private String tipoCombus; // Tipo de combustível do gerador (ex: Diesel, Gasolina)
    private String autonomia;  // Autonomia de funcionamento do gerador

    /**
     * Construtor da classe Gerador.
     * 
     * @param nome O nome do gerador.
     * @param codigo O código do gerador.
     * @param preco O preço do gerador.
     * @param tipoCombus O tipo de combustível do gerador.
     * @param autonomia A autonomia do gerador.
     */
    public Gerador(String nome, String codigo, float preco, String tipoCombus, String autonomia) {
    	super(nome, codigo, preco);
    	
    	setTipoCombus(tipoCombus);
    	setAutonomia(autonomia);
    }
    
    /**
     * Define o tipo de combustível do gerador.
     *
     * @param tipoCombus O tipo de combustível do gerador.
     */
    public void setTipoCombus(String tipoCombus) {
    	this.tipoCombus = tipoCombus;
    }
    
    /**
     * Obtém o tipo de combustível do gerador.
     *
     * @return O tipo de combustível do gerador.
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
     * Obtém a autonomia do gerador.
     *
     * @return A autonomia do gerador.
     */
    public String getAutonomia() {
        return autonomia;
    }

    /**
     * Realiza uma manutenção no gerador.
     *
     * @param servico O serviço de manutenção a ser realizado.
     * @return Uma mensagem indicando a manutenção realizada.
     */
    public String realizarManutencao(ServicoManutencao servico) {
		return "Realizando manutenção do gerador: " + servico.getDescricao();
	}
    
    /**
     * Imprime as informações do gerador.
     */
    public void imprimirInformacoes() {
    	System.out.println("Nome: " + getNome());
		System.out.println("Codigo:" + getCodigo());
		System.out.println("Preço: " + getPreco());
		System.out.println("Tipo Combustão: " + this.tipoCombus);
		System.out.println("Autonomia: " + this.autonomia);
	}
}
