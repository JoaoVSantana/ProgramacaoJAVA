package Exercicio;

/**
 * Classe que representa um inversor de frequ�ncia da marca WEG.
 * Estende a classe ProdutoWeg para herdar seus atributos e m�todos.
 * 
 * @author
 */
public class InversorFrequencia extends ProdutoWeg {

	/**
	 * Atributos da Classe
	 */
	private String capFrequencia; // Capacidade de frequ�ncia do inversor (ex: 50-60 Hz)
	private int NFases;           // N�mero de fases do inversor

	/**
	 * Construtor da classe InversorFrequencia.
	 * 
	 * @param nome O nome do inversor de frequ�ncia.
	 * @param codigo O c�digo do inversor de frequ�ncia.
	 * @param preco O pre�o do inversor de frequ�ncia.
	 * @param capFrequencia A capacidade de frequ�ncia do inversor.
	 * @param NFases O n�mero de fases do inversor.
	 */
	public InversorFrequencia(String nome, String codigo, float preco, String capFrequencia, int NFases) {
		super(nome, codigo, preco);
		
		setCapFrequencia(capFrequencia);
		setNFases(NFases);
	}
	
	/**
	 * Obt�m a capacidade de frequ�ncia do inversor.
	 * 
	 * @return A capacidade de frequ�ncia do inversor.
	 */
	public String getCapFrequencia() {
		return capFrequencia;
	}
	
	/**
	 * Define a capacidade de frequ�ncia do inversor.
	 * 
	 * @param capFrequencia A capacidade de frequ�ncia do inversor.
	 */
	public void setCapFrequencia(String capFrequencia) {
		this.capFrequencia = capFrequencia;
	}
	
	/**
	 * Obt�m o n�mero de fases do inversor.
	 * 
	 * @return O n�mero de fases do inversor.
	 */
	public int getNFases() {
		return NFases;
	}
	
	/**
	 * Define o n�mero de fases do inversor.
	 * 
	 * @param nFases O n�mero de fases do inversor.
	 */
	public void setNFases(int nFases) {
		NFases = nFases;
	}
	
	/**
	 * Realiza uma manuten��o no inversor de frequ�ncia.
	 *
	 * @param servico O servi�o de manuten��o a ser realizado.
	 * @return Uma mensagem indicando a manuten��o realizada.
	 */
	public String realizarManutencao(ServicoManutencao servico) {
		return "Realizando manuten��o do inversor: " + servico.getDescricao();
	}
	
	/**
	 * Imprime as informa��es do inversor de frequ�ncia.
	 */
	public void imprimirInformacoes() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Pre�o: " + getPreco());
		System.out.println("Capacidade de Frequ�ncia: " + this.capFrequencia);
		System.out.println("N�mero de Fases: " + this.NFases);
	}
}
