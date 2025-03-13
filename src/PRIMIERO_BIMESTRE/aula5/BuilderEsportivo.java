package PRIMIERO_BIMESTRE.aula5;

public class BuilderEsportivo implements Builder{

    private Carro carro;
    private Motor motor;
    private Transmissao transmissao;
    private Gps gps;

    public BuilderEsportivo() {
        this.carro = new Carro();
        this.carro.setTipo("Esportivo");
        this.carro.setPortas(2);

        this.motor = new Motor();
        this.motor.desligar();

        this.transmissao = new Transmissao();
        this.transmissao.setTipo("Manual");

        this.gps = new Gps();

        this.carro.setMotor(motor);
        this.carro.setGps(gps);
        this.carro.setTransmissão(transmissao);
    }

    @Override
    public void setCapacidadeTanque(double capacidadetanque) {

    }

    @Override
    public void setMotorVolume(double volume) {

    }

    @Override
    public void setMotorPotencia(int potencia) {

    }

    @Override
    public void setMotorKilometragem(int kilometragem) {

    }

    @Override
    public void setTransmissaoQuantMarchas(int quantMarchas) {

    }

    @Override
    public void setGpsRota(String rota) {

    }

    @Override
    public void setGpsMarca(String marca) {

    }

    @Override
    public void setGpsModelo(String modelo) {
        this.gps.setModelo(modelo);
    }

    public Carro get (){
        return this.carro;
    }

}
