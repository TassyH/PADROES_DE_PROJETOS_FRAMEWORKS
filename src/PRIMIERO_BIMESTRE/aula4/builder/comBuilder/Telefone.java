package PRIMIERO_BIMESTRE.aula4.builder.comBuilder;

public class Telefone {

    private int ddd;
    private int numero;
    private String tipo;

    public Telefone(int ddd, int numero, String tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Telefone(){

    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
