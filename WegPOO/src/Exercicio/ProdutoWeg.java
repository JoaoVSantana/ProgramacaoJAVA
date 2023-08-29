package Exercicio;

/**
 * Classe que representa qualquer produto da marca WEG.
 * Esta � a classe pai para outros produtos espec�ficos.
 * Cont�m atributos b�sicos que s�o comuns a todos os produtos.
 * 
 * @author Joao Victor Santana
 */
public class ProdutoWeg {
	
	/**
	 * Atributos da classe
	 */
	private String nome;     // Nome do produto
	private String codigo;   // C�digo do produto
	private String tipo;     // Tipo do produto
	private int potencia;    // Pot�ncia do produto
	private String tensao;   // Tens�o do produto
	private int capacidade;  // Capacidade do produto
	private float preco;     // Pre�o do produto
	
	/**
	 * Construtor padr�o da classe.
	 * 
	 * @param nome O nome do produto.
	 * @param codigo O c�digo do produto.
	 * @param preco O pre�o do produto.
	 */
	public ProdutoWeg(String nome, String codigo, float preco) {
		setNome(nome);
		setCodigo(codigo);
		setPreco(preco);
	}
	
	/**
	 * Obt�m o nome do produto.
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
	 * Obt�m o c�digo do produto.
	 * 
	 * @return O c�digo do produto.
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Define o c�digo do produto.
	 * 
	 * @param codigo O c�digo do produto.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Obt�m o tipo do produto.
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
	 * Obt�m a pot�ncia do produto.
	 * 
	 * @return A pot�ncia do produto.
	 */
	public int getPotencia() {
		return potencia;
	}
	
	/**
	 * Define a pot�ncia do produto.
	 * 
	 * @param potencia A pot�ncia do produto.
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	/**
	 * Obt�m a tens�o do produto.
	 * 
	 * @return A tens�o do produto.
	 */
	public String getTensao() {
		return tensao;
	}
	
	/**
	 * Define a tens�o do produto.
	 * 
	 * @param tensao A tens�o do produto.
	 */
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	
	/**
	 * Obt�m a capacidade do produto.
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
	 * Obt�m o pre�o do produto.
	 * 
	 * @return O pre�o do produto.
	 */
	public float getPreco() {
		return preco;
	}
	
	/**
	 * Define o pre�o do produto.
	 * 
	 * @param preco O pre�o do produto.
	 */
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	/**
	 * M�todo vazio para imprimir informa��es espec�ficas do produto.
	 * Cada subclasse pode implementar esse m�todo de acordo com sua necessidade.
	 */
	public void imprimirInformacoes() {
		
	}
}
