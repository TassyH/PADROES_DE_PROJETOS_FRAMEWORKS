package PRIMIERO_BIMESTRE.aula6.factory_trabalho;

public class PorItem extends Empregado{

    private double valor_producao;
    private int quantidade;

    public PorItem(String nome, String email, int anoContratacao, double valor_producao, int quantidade) {
        super(nome, email, anoContratacao);
        this.valor_producao = valor_producao;
        this.quantidade = quantidade;
    }

    public PorItem(String nome, String email, int anoContratacao) {
        super(nome, email, anoContratacao);
    }

    public double getValor_producao() {
        return valor_producao;
    }

    public void setValor_producao(double valor_producao) {
        this.valor_producao = valor_producao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PorItem{" +
                "\n valor_producao=" + valor_producao +
                "\n quantidade =" + quantidade +
                '}';
    }

    @Override
    public double ganhar() {
        return getValor_producao()*getQuantidade();
    }
}
