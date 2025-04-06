package PRIMIERO_BIMESTRE.aula6_factory.factory_atividades.ativ3;

public class Carnivoro extends Prato{
    private double quantFrango;
    private double quantBovino;

    public Carnivoro(String nome, double calorias, double quantFrango, double quantBovino) {
        super(nome, calorias);
        this.quantFrango = quantFrango;
        this.quantBovino = quantBovino;
    }

    public double getQuantFrango() {
        return quantFrango;
    }

    public void setQuantFrango(double quantFrango) {
        this.quantFrango = quantFrango;
    }

    public double getQuantBovino() {
        return quantBovino;
    }

    public void setQuantBovino(double quantBovino) {
        this.quantBovino = quantBovino;
    }

    @Override
    public String toString() {
        return "Carnivoro{" +
                "quantFrango=" + quantFrango +
                ", quantBovino=" + quantBovino +
                '}';
    }

}
