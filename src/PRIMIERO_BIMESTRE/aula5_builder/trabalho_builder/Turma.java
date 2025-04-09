package PRIMIERO_BIMESTRE.aula5_builder.trabalho_builder;

public class Turma {

    private String descricao;
    private int numero;
    private int ano;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n Turma{" +
                "\n descricao='" + descricao + '\'' +
                "\n numero=" + numero +
                "\n ano=" + ano +
                '}';
    }
}
