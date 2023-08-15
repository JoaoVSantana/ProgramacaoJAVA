import java.util.Calendar;

public class Animal {
	private String nomeComum;
	private String nomeCientifico;
	private String especie;
	private String cor;
	private String classe; // Mamífero, anfíbio,
	private String tamanho;
	private float peso;
	private String habitat;
	private String genero;
	private Calendar dataNascimento;

	public String alimentar(String energia) {
		return "Se alimentando de " + energia;
	}

	public String reproduzir() {
		return "Reproduzindo...";
	}

	public String locomover(float sentido, float velocidade) {
		return "Locomovendo-se no sentido" + sentido + " e velocidade " + velocidade;
	}
	
	public String repousar(float tempo, String unidade) {
		return "Repousando por " + tempo + unidade;
	}
	
	//getters and setters
	
	public String getNomeComum() {
		return nomeComum;
	}

	public void setNomeComum(String nomeComum) {
		this.nomeComum = nomeComum;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Animal(String nomeCientifico, float peso, String tamanho) {
		setNomeCientifico(nomeCientifico);
		setTamanho(tamanho);
		setPeso(peso);
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

}
