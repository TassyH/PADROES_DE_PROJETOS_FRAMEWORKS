package PRIMIERO_BIMESTRE.aula6.factory_trabalho;

public class PorComissao extends Empregado {

    private double salario;
    private double comissao;
    private int vendas;

    public PorComissao(String nome, String email, int anoContratacao, double salario, double comissao, int vendas) {
        super(nome, email, anoContratacao);
        this.salario = salario;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return "PorComissao{" +
                "\n salario=" + salario +
                "\n comissao=" + comissao +
                "\n vendas=" + vendas +
                '}';
    }

    @Override
    public double ganhar() {
        return (getSalario() + getComissao() * getVendas());
    }
}
