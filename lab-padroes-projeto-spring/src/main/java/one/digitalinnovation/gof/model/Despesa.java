package one.digitalinnovation.gof.model;

public class Despesa {
    private double valor;
    private String descricao;
    private NivelAprovacao nivelAprovacao;

    // getters e setters omitidos para simplicidade

    public Despesa(double valor, String descricao, NivelAprovacao nivelAprovacao) {
        this.valor = valor;
        this.descricao = descricao;
        this.nivelAprovacao = nivelAprovacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NivelAprovacao getNivelAprovacao() {
        return nivelAprovacao;
    }

    public void setNivelAprovacao(NivelAprovacao nivelAprovacao) {
        this.nivelAprovacao = nivelAprovacao;
    }
}
