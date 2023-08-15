
public class Peixe extends Animal{
	//Atributos
	private String cor;
	private String raca;
	private String dieta;
	private String tipoDagua;
	
	//métodos
	
	public String respirar(String tipoDagua) {
		if(tipoDagua.matches(this.tipoDagua)) {
			return "Respirando...";
		}
		return "Tipo de água imprópria";
	}
	
	public String bolhas() {
		return "Bolhas, bolhas...";
	}
	
	public String reproduzir() {
		return "Reproduzindo peixinhos...";
	}
	
	//getters and setters

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public String getTipoDagua() {
		return tipoDagua;
	}

	public void setTipoDagua(String tipoDagua) {
		this.tipoDagua = tipoDagua;
	}
	
	//Construtor

	public Peixe(String nomeCientifico, float peso, String tamanho, String cor, String raca, String dieta,
			String tipoDagua) {
		super(nomeCientifico, peso, tamanho);
		this.cor = cor;
		this.raca = raca;
		this.dieta = dieta;
		this.tipoDagua = tipoDagua;
	}
	
}
