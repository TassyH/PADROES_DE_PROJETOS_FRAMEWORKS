package PRIMIERO_BIMESTRE.aula5.trabalho_builder;

public class Telefone {

    private int ddd;
    private int numero;
    private String tipo;

    public int getAdd() {
        return ddd;
    }

    public void setAdd(int add) {
        this.ddd = add;
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
        return "\n Telefone{" +
                "\n add=" + ddd +
                "\n numero=" + numero +
                "\n tipo='" + tipo + '\'' +
                '}';
    }
}
