package PRIMIERO_BIMESTRE.aula5.trabalho_builder;

public class Cidade {

    private String cidade;
    private String estado;
    private String pais;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return " \n Cidade{" +
                "\n cidade='" + cidade + '\'' +
                "\n estado='" + estado + '\'' +
                "\n pais='" + pais + '\'' +
                '}';
    }
}
