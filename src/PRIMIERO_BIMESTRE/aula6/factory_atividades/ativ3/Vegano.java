package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ3;

public class Vegano extends Prato{

    private double quantiVerdura;
    private double quantLegume;

    public Vegano(String nome, double calorias, double quantiVerdura, double quantLegume) {
        super(nome, calorias);
        this.quantiVerdura = quantiVerdura;
        this.quantLegume = quantLegume;
    }

    public double getQuantiVerdura() {
        return quantiVerdura;
    }

    public void setQuantiVerdura(double quantiVerdura) {
        this.quantiVerdura = quantiVerdura;
    }

    public double getQuantLegume() {
        return quantLegume;
    }

    public void setQuantLegume(double quantLegume) {
        this.quantLegume = quantLegume;
    }

    @Override
    public String toString() {
        return "Vegano{" +
                "quantiVerdura=" + quantiVerdura +
                ", quantLegume=" + quantLegume +
                '}';
    }

}
