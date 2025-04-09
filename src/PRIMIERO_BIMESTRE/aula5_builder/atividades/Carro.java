package PRIMIERO_BIMESTRE.aula5_builder.atividades;

public class Carro {

    private String tipo;
    private int portas;
    private double capacidadeTanque;
    private Motor motor;
    private Transmissao transmissão;
    private Gps gps;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmissao getTransmissão() {
        return transmissão;
    }

    public void setTransmissão(Transmissao transmissão) {
        this.transmissão = transmissão;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return " \n Carro{" +
                " \n tipo='" + tipo + '\'' +
                "\n portas=" + portas +
                "\n capacidadeTanque=" + capacidadeTanque +
                "\n montor=" + motor +
                "\n transmissão=" + transmissão +
                "\n gps=" + gps +
                '}';
    }
}
