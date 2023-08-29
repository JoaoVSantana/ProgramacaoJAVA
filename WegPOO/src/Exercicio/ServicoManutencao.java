package Exercicio;

/**
 * Classe que representa um servi�o de manuten��o.
 * Um servi�o de manuten��o tem uma descri��o e um custo associado.
 * 
 * @author
 */
public class ServicoManutencao {

    /**
     * Atributos da Classe
     */
    private String descricao; // Descri��o do servi�o de manuten��o
    private float custo;      // Custo do servi�o de manuten��o

    /**
     * Construtor da classe ServicoManutencao.
     * 
     * @param descricao A descri��o do servi�o de manuten��o.
     * @param custo O custo do servi�o de manuten��o.
     */
    public ServicoManutencao(String descricao, float custo) {
        setDescricao(descricao);
        setCusto(custo);
    }

    /**
     * Obt�m a descri��o do servi�o de manuten��o.
     * 
     * @return A descri��o do servi�o de manuten��o.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descri��o do servi�o de manuten��o.
     * 
     * @param descricao A descri��o do servi�o de manuten��o.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obt�m o custo do servi�o de manuten��o.
     * 
     * @return O custo do servi�o de manuten��o.
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo do servi�o de manuten��o.
     * 
     * @param custo O custo do servi�o de manuten��o.
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
}
