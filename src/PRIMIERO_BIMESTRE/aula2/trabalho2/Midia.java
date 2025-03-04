package PRIMIERO_BIMESTRE.aula2.trabalho2;


public class Midia extends Produto {

    protected String artista;

    public Midia(int codigo, double preco, String artista) {
        super(codigo, preco);
        this.artista = artista;
    }

    @Override
    public double calculaImposto() {
        return  this.preco * 0.05;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "artista='" + artista + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                ", Imposto = "+ calculaImposto() +
                ", Preço com IMPOSTO: " + (preco +calculaImposto()) +
                ", Preco TOTAL (imposto + frete): "+ (preco +calculaImposto() + calcularFrete()) +
                '}';
    }
}
