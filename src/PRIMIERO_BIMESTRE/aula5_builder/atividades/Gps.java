package PRIMIERO_BIMESTRE.aula5_builder.atividades;

public class Gps {

    private String rota;
    private String marca;
    private String modelo;


    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Gps{" +
                " \n rota='" + rota + '\'' +
                " \n marca='" + marca + '\'' +
                "\n  modelo='" + modelo + '\'' +
                '}';
    }
}
