package Exercicio;

/**
 * Classe que representa um inversor de frequência da marca WEG.
 * Estende a classe ProdutoWeg para herdar seus atributos e métodos.
 * 
 * @author
 */
public class InversorFrequencia extends ProdutoWeg {

	/**
	 * Atributos da Classe
	 */
	private String capFrequencia; // Capacidade de frequência do inversor (ex: 50-60 Hz)
	private int NFases;           // Número de fases do inversor

	/**
	 * Construtor da classe InversorFrequencia.
	 * 
	 * @param nome O nome do inversor de frequência.
	 * @param codigo O código do inversor de frequência.
	 * @param preco O preço do inversor de frequência.
	 * @param capFrequencia A capacidade de frequência do inversor.
	 * @param NFases O número de fases do inversor.
	 */
	public InversorFrequencia(String nome, String codigo, float preco, String capFrequencia, int NFases) {
		super(nome, codigo, preco);
		
		setCapFrequencia(capFrequencia);
		setNFases(NFases);
	}
	
	/**
	 * Obtém a capacidade de frequência do inversor.
	 * 
	 * @return A capacidade de frequência do inversor.
	 */
	public String getCapFrequencia() {
		return capFrequencia;
	}
	
	/**
	 * Define a capacidade de frequência do inversor.
	 * 
	 * @param capFrequencia A capacidade de frequência do inversor.
	 */
	public void setCapFrequencia(String capFrequencia) {
		this.capFrequencia = capFrequencia;
	}
	
	/**
	 * Obtém o número de fases do inversor.
	 * 
	 * @return O número de fases do inversor.
	 */
	public int getNFases() {
		return NFases;
	}
	
	/**
	 * Define o número de fases do inversor.
	 * 
	 * @param nFases O número de fases do inversor.
	 */
	public void setNFases(int nFases) {
		NFases = nFases;
	}
	
	/**
	 * Realiza uma manutenção no inversor de frequência.
	 *
	 * @param servico O serviço de manutenção a ser realizado.
	 * @return Uma mensagem indicando a manutenção realizada.
	 */
	public String realizarManutencao(ServicoManutencao servico) {
		return "Realizando manutenção do inversor: " + servico.getDescricao();
	}
	
	/**
	 * Imprime as informações do inversor de frequência.
	 */
	public void imprimirInformacoes() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Preço: " + getPreco());
		System.out.println("Capacidade de Frequência: " + this.capFrequencia);
		System.out.println("Número de Fases: " + this.NFases);
	}
}
