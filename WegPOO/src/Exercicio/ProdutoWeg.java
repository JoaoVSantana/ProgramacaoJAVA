package Exercicio;

/**Classe Pai dos produtos no sistema
 * 
 * 
 * @author Joao Victor Santana 
 */

public class ProdutoWeg {
	
	/**
	 * Atributos da classe
	 */
	private String codigo;
	private String tipo;
	private int potencia;
	private String tensao;
	private int capacidade;
	private float preco;
	
	/**
	 * Construtor padr�o da classe
	 */
	public ProdutoWeg() {
		super();
		
	}
	
	/**
	 * M�todo para pegar o atributo 'codigo'
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * M�todo para modificar o atributo 'codigo'
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * M�todo para pegar o atributo 'tipo'
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * M�todo para modificar o atributo 'tipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 *  M�todo para pegar o atributo 'potencia'
	 * 
	 * @return potencia
	 */
	public int getPotencia() {
		return potencia;
	}
	
	/**
	 * M�todo para modificar o atributo 'potencia'
	 * 
	 * @param potencia
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	/**
	 * M�todo para pegar o atributo 'tensao'
	 * 
	 * @return tensao
	 */
	public String getTensao() {
		return tensao;
	}
	
	/**
	 * M�todo para modificar o atributo 'tensao'
	 * 
	 * @param tensao
	 */
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	/**
	 * M�todo para pegar o atributo 'capacidade'
	 * 
	 * @return capacidade
	 */
	public int getCapacidade() {
		return capacidade;
	}
	
	/**
	 * M�todo para modificar o atributo 'capacidade'
	 * 
	 * @param capacidade
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	/**
	 * M�todo para pegar o atributo 'preco'
	 * 
	 * @return preco
	 */
	public float getPreco() {
		return preco;
	}
	
	/**
	 * M�todo para modificar o atributo 'preco'
	 * 
	 * @param preco
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
