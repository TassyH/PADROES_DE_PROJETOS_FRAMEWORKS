package PRIMIERO_BIMESTRE.aula2;

public class Midia extends Produto{

    protected String artista;

    public Midia(int codigo, double preco, double imposto, String artista) {
        super(codigo, preco, imposto);
        this.artista = artista;
    }

    @Override
    public double calculaImposto() {
        return this.preco = this.preco * 0.05;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "artista='" + artista + '\'' +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }
}
