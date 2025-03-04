package PRIMIERO_BIMESTRE.aula2.trabalho2;

public abstract class Produto {

    protected double preco;
    protected int codigo;

    public Produto(int codigo, double preco) {
        this.preco = preco;
        this.codigo = codigo;
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

    public double darDesconto(double percentual){
        double desconto = ((percentual/100) * this.preco);
        return this.preco -= desconto;
    }

    public void reajustarPreco(double percentual){
        double ajuste = ((percentual/100)*getPreco());
        this.preco = this.preco + ajuste;
    }

    public float calcularFrete(){
        double porcent = 0.03;
        double fixo = 5.00;
        double calc = this.preco * porcent;
        return (float) (calc + fixo);
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
