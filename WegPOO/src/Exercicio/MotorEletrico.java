package Exercicio;

/**
 * Classe que representa um motor elétrico da marca WEG.
 * Estende a classe ProdutoWeg para herdar seus atributos e métodos.
 * 
 * @author
 */
public class MotorEletrico extends ProdutoWeg {

    /**
     * Atributos da Classe
     */
    private String tipoEnrolamento; // Tipo de enrolamento do motor (ex: Enrolado, Assimétrico)
    private String eficiencia;      // Eficiência do motor (ex: Boa, Alta)

    /**
     * Construtor da classe MotorEletrico.
     * 
     * @param nome O nome do motor elétrico.
     * @param codigo O código do motor elétrico.
     * @param preco O preço do motor elétrico.
     * @param tipoEnrolamento O tipo de enrolamento do motor.
     * @param eficiencia A eficiência do motor.
     */
    public MotorEletrico(String nome, String codigo, float preco, String tipoEnrolamento, String eficiencia) {
        super(nome, codigo, preco);
        
        setTipoEnrolamento(tipoEnrolamento);
        setEficiencia(eficiencia);
    }
    
    /**
     * Obtém o tipo de enrolamento do motor.
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
     * Obtém a eficiência do motor.
     * 
     * @return A eficiência do motor.
     */
    public String getEficiencia() {
        return eficiencia;
    }
    
    /**
     * Define a eficiência do motor.
     * 
     * @param eficiencia A eficiência do motor.
     */
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    /**
     * Realiza uma manutenção no motor elétrico.
     *
     * @param servico O serviço de manutenção a ser realizado.
     * @return Uma mensagem indicando a manutenção realizada.
     */
    public String realizarManutencao(ServicoManutencao servico) {
        return "Realizando manutenção do motor: " + servico.getDescricao();
    }
    
    /**
     * Imprime as informações do motor elétrico.
     */
    public void imprimirInformacoes() {
        System.out.println();
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tipo de Enrolamento: " + this.tipoEnrolamento);
        System.out.println("Eficiência: " + this.eficiencia);
    }
}
