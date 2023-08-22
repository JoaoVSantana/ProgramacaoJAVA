package Exercicio;

/**
 * Classe que representa um gerador, um tipo de produto WEG.
 * Estende a classe ProdutoWeg, herdando seus atributos e métodos.]
 * 
 * @author Joao Victor Santana
 */
public class Gerador extends ProdutoWeg {

	/**
	 * Atributos da Classe
	 */
    private String tipoCombus;
    private String autonomia;

    /**
     * Obtém o tipo de combustível do gerador.
     *
     * @return O tipo de combustível do gerador.
     */
    public String getTipoCombus() {
        return tipoCombus;
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
     * Obtém a autonomia do gerador.
     *
     * @return autonomia
     */
    public String getAutonomia() {
        return autonomia;
    }

    /**
     * Define a autonomia do gerador.
     *
     * @param autonomia A autonomia do gerador.
     */
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

}
