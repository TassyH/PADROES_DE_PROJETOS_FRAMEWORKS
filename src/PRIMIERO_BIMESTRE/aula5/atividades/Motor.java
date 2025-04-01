package PRIMIERO_BIMESTRE.aula5.atividades;


public class Motor {

    private double volume;
    private int potencia;
    private double kilometragem;
    private boolean ligado;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public boolean ligar(){
        return true;
    }

    public boolean desligar(){
      return  ligado = false;
    }

    public boolean estaLigado(){
        return ligado;
    }

    public void andar(double distancia){
        if(ligado){
            this.kilometragem += distancia;
        }else {
            System.out.println("nao pode andar... ligar o carro antes bro");
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "volume=" + volume +
                ", potencia=" + potencia +
                ", kilometragem=" + kilometragem +
                ", ligado=" + ligado +
                '}';
    }
}
