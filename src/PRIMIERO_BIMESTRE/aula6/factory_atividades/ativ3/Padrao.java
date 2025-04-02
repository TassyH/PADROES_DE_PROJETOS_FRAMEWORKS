package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ3;

public class Padrao extends Prato{

    private double quantProteina;
    private double quantCarboidrato;
    private double quantSalada;

    public Padrao(String nome, double calorias, double quantProteina, double quantCarboidrato, double quantSalada) {
        super(nome, calorias);
        this.quantProteina = quantProteina;
        this.quantCarboidrato = quantCarboidrato;
        this.quantSalada = quantSalada;
    }

    public double getQuantProteina() {
        return quantProteina;
    }

    public void setQuantProteina(double quantProteina) {
        this.quantProteina = quantProteina;
    }

    public double getQuantCarboidrato() {
        return quantCarboidrato;
    }

    public void setQuantCarboidrato(double quantCarboidrato) {
        this.quantCarboidrato = quantCarboidrato;
    }

    public double getQuantSalada() {
        return quantSalada;
    }

    public void setQuantSalada(double quantSalada) {
        this.quantSalada = quantSalada;
    }

    @Override
    public String toString() {
        return "Padrao{" +
                "quantProteina=" + quantProteina +
                ", quantCarboidrato=" + quantCarboidrato +
                ", quantSalada=" + quantSalada +
                '}';
    }

}
