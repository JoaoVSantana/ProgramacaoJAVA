package Exercicio;

public class InversorFrequencia extends ProdutoWeg{

	private String capFrequencia;
	private int NFases;
	
	ProdutoWeg inversor = new ProdutoWeg ();
	
	public String getCapFrequencia() {
		return capFrequencia;
	}
	public void setCapFrequencia(String capFrequencia) {
		this.capFrequencia = capFrequencia;
	}
	public int getNFases() {
		return NFases;
	}
	public void setNFases(int nFases) {
		NFases = nFases;
	}
	
	
}
