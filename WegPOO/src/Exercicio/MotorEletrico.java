package Exercicio;

/**
 * Classe que representa um motor el�trico da marca WEG.
 * Estende a classe ProdutoWeg para herdar seus atributos e m�todos.
 * 
 * @author
 */
public class MotorEletrico extends ProdutoWeg {

    /**
     * Atributos da Classe
     */
    private String tipoEnrolamento; // Tipo de enrolamento do motor (ex: Enrolado, Assim�trico)
    private String eficiencia;      // Efici�ncia do motor (ex: Boa, Alta)

    /**
     * Construtor da classe MotorEletrico.
     * 
     * @param nome O nome do motor el�trico.
     * @param codigo O c�digo do motor el�trico.
     * @param preco O pre�o do motor el�trico.
     * @param tipoEnrolamento O tipo de enrolamento do motor.
     * @param eficiencia A efici�ncia do motor.
     */
    public MotorEletrico(String nome, String codigo, float preco, String tipoEnrolamento, String eficiencia) {
        super(nome, codigo, preco);
        
        setTipoEnrolamento(tipoEnrolamento);
        setEficiencia(eficiencia);
    }
    
    /**
     * Obt�m o tipo de enrolamento do motor.
     * 
     * @return O tipo de enrolamento do motor.
     */
    public String getTipoEnrolamento() {
        return tipoEnrolamento;
    }
    
    /**
     * Define o tipo de enrolamento do motor.
     * 
     * @param tipoEnrolamento O tipo de enrolamento do motor.
     */
    public void setTipoEnrolamento(String tipoEnrolamento) {
        this.tipoEnrolamento = tipoEnrolamento;
    }
    
    /**
     * Obt�m a efici�ncia do motor.
     * 
     * @return A efici�ncia do motor.
     */
    public String getEficiencia() {
        return eficiencia;
    }
    
    /**
     * Define a efici�ncia do motor.
     * 
     * @param eficiencia A efici�ncia do motor.
     */
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    /**
     * Realiza uma manuten��o no motor el�trico.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     * @return Uma mensagem indicando a manuten��o realizada.
     */
    public String realizarManutencao(ServicoManutencao servico) {
        return "Realizando manuten��o do motor: " + servico.getDescricao();
    }
    
    /**
     * Imprime as informa��es do motor el�trico.
     */
    public void imprimirInformacoes() {
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Pre�o: " + getPreco());
        System.out.println("Tipo de Enrolamento: " + this.tipoEnrolamento);
        System.out.println("Efici�ncia: " + this.eficiencia);
    }
}
