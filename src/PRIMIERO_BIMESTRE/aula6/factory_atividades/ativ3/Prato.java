package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ3;

public abstract class Prato {
     protected String nome;
     protected double calorias;

    public Prato(String nome, double calorias) {
        this.nome = nome;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
