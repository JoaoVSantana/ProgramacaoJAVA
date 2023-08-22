package Exercicio;

/**
 * Classe que representa um gerador, um tipo de produto WEG.
 * Estende a classe ProdutoWeg, herdando seus atributos e m�todos.]
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
     * Obt�m o tipo de combust�vel do gerador.
     *
     * @return O tipo de combust�vel do gerador.
     */
    public String getTipoCombus() {
        return tipoCombus;
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
     * Obt�m a autonomia do gerador.
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
