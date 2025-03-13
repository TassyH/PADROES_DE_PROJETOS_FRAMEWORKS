package PRIMIERO_BIMESTRE.aula5;

public class Transmissao {

    private String tipo;
    private int quantMarchas;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantMarchas() {
        return quantMarchas;
    }

    public void setQuantMarchas(int quantMarchas) {
        this.quantMarchas = quantMarchas;
    }

    @Override
    public String toString() {
        return "Transmissão{" +
                "\n tipo='" + tipo + '\'' +
                "\n quantMarchas=" + quantMarchas +
                '}';
    }
}
