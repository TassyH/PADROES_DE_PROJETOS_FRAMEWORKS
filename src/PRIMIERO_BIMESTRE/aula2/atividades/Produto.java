package PRIMIERO_BIMESTRE.aula2.atividades;

public abstract class Produto {

    protected double preco;
    protected int codigo;
    protected double imposto;

    public Produto(int codigo, double preco, double imposto) {
        this.preco = preco;
        this.codigo = codigo;
        this.imposto = imposto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void darDesconto(double percentual){
        double desconto = ((percentual/100) * this.preco);
        System.out.println("desconto calcilado: "+desconto);
        this.preco -= desconto;
    }

    public void reajustarPreco(double percentual){
        double ajuste = ((percentual/100)*getPreco());
        this.preco = this.preco + ajuste;
    }

    public double calcularFrete(){
        double porcent = 0.03;
        double fixo = 5.00;
        double calc = this.preco * porcent;
        return calc + fixo;
    }

    public abstract double calculaImposto();


    @Override
    public String toString() {
        return "Produto{" +
                "preco= " + preco +
                ", codigo =" + codigo +
                ", frete = "+calcularFrete() +
                '}';
    }
}
