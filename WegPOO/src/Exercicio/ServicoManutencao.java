package Exercicio;

/**
 * Classe que representa um serviço de manutenção.
 * Um serviço de manutenção tem uma descrição e um custo associado.
 * 
 * @author
 */
public class ServicoManutencao {

    /**
     * Atributos da Classe
     */
    private String descricao; // Descrição do serviço de manutenção
    private float custo;      // Custo do serviço de manutenção

    /**
     * Construtor da classe ServicoManutencao.
     * 
     * @param descricao A descrição do serviço de manutenção.
     * @param custo O custo do serviço de manutenção.
     */
    public ServicoManutencao(String descricao, float custo) {
        setDescricao(descricao);
        setCusto(custo);
    }

    /**
     * Obtém a descrição do serviço de manutenção.
     * 
     * @return A descrição do serviço de manutenção.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do serviço de manutenção.
     * 
     * @param descricao A descrição do serviço de manutenção.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço de manutenção.
     * 
     * @return O custo do serviço de manutenção.
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo do serviço de manutenção.
     * 
     * @param custo O custo do serviço de manutenção.
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
}
