package Exercicio;

public class MotorEletrico extends ProdutoWeg{

	private String tipoEnrolamento;
	private String eficiencia;
	
	ProdutoWeg motor = new ProdutoWeg ();
	
	public String getTipoEnrolamento() {
		return tipoEnrolamento;
	}
	public void setTipoEnrolamento(String tipoEnrolamento) {
		this.tipoEnrolamento = tipoEnrolamento;
	}
	public String getEficiencia() {
		return eficiencia;
	}
	public void setEficiencia(String eficiencia) {
		this.eficiencia = eficiencia;
	}
	
	
}
