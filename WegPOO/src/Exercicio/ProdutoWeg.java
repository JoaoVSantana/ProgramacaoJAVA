package Exercicio;

/**
 * Classe que representa qualquer produto da marca WEG.
 * Esta é a classe pai para outros produtos específicos.
 * Contém atributos básicos que são comuns a todos os produtos.
 * 
 * @author Joao Victor Santana
 */
public class ProdutoWeg {
	
	/**
	 * Atributos da classe
	 */
	private String nome;     // Nome do produto
	private String codigo;   // Código do produto
	private String tipo;     // Tipo do produto
	private int potencia;    // Potência do produto
	private String tensao;   // Tensão do produto
	private int capacidade;  // Capacidade do produto
	private float preco;     // Preço do produto
	
	/**
	 * Construtor padrão da classe.
	 * 
	 * @param nome O nome do produto.
	 * @param codigo O código do produto.
	 * @param preco O preço do produto.
	 */
	public ProdutoWeg(String nome, String codigo, float preco) {
		setNome(nome);
		setCodigo(codigo);
		setPreco(preco);
	}
	
	/**
	 * Obtém o nome do produto.
	 * 
	 * @return O nome do produto.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome do produto.
	 * 
	 * @param nome O nome do produto.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtém o código do produto.
	 * 
	 * @return O código do produto.
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Define o código do produto.
	 * 
	 * @param codigo O código do produto.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Obtém o tipo do produto.
	 * 
	 * @return O tipo do produto.
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Define o tipo do produto.
	 * 
	 * @param tipo O tipo do produto.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * Obtém a potência do produto.
	 * 
	 * @return A potência do produto.
	 */
	public int getPotencia() {
		return potencia;
	}
	
	/**
	 * Define a potência do produto.
	 * 
	 * @param potencia A potência do produto.
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	/**
	 * Obtém a tensão do produto.
	 * 
	 * @return A tensão do produto.
	 */
	public String getTensao() {
		return tensao;
	}
	
	/**
	 * Define a tensão do produto.
	 * 
	 * @param tensao A tensão do produto.
	 */
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	/**
	 * Obtém a capacidade do produto.
	 * 
	 * @return A capacidade do produto.
	 */
	public int getCapacidade() {
		return capacidade;
	}
	
	/**
	 * Define a capacidade do produto.
	 * 
	 * @param capacidade A capacidade do produto.
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	/**
	 * Obtém o preço do produto.
	 * 
	 * @return O preço do produto.
	 */
	public float getPreco() {
		return preco;
	}
	
	/**
	 * Define o preço do produto.
	 * 
	 * @param preco O preço do produto.
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	/**
	 * Método vazio para imprimir informações específicas do produto.
	 * Cada subclasse pode implementar esse método de acordo com sua necessidade.
	 */
	public void imprimirInformacoes() {
		
	}
}
