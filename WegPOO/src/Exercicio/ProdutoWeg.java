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
	 * Construtor padrão da classe
	 */
	public ProdutoWeg() {
		super();
		
	}
	
	/**
	 * Método para pegar o atributo 'codigo'
	 * 
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método para modificar o atributo 'codigo'
	 * 
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Método para pegar o atributo 'tipo'
	 * 
	 * @return tipo
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Método para modificar o atributo 'tipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 *  Método para pegar o atributo 'potencia'
	 * 
	 * @return potencia
	 */
	public int getPotencia() {
		return potencia;
	}
	
	/**
	 * Método para modificar o atributo 'potencia'
	 * 
	 * @param potencia
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	/**
	 * Método para pegar o atributo 'tensao'
	 * 
	 * @return tensao
	 */
	public String getTensao() {
		return tensao;
	}
	
	/**
	 * Método para modificar o atributo 'tensao'
	 * 
	 * @param tensao
	 */
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	/**
	 * Método para pegar o atributo 'capacidade'
	 * 
	 * @return capacidade
	 */
	public int getCapacidade() {
		return capacidade;
	}
	
	/**
	 * Método para modificar o atributo 'capacidade'
	 * 
	 * @param capacidade
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	/**
	 * Método para pegar o atributo 'preco'
	 * 
	 * @return preco
	 */
	public float getPreco() {
		return preco;
	}
	
	/**
	 * Método para modificar o atributo 'preco'
	 * 
	 * @param preco
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
