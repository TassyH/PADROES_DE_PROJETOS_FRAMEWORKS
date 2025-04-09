package PRIMIERO_BIMESTRE.aula5_builder.trabalho_builder;

public class Formacao {

    private int ano;
    private String instituicao;
    private Cidade cidade;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n Formacao{" +
                "\n ano=" + ano +
                "\n instituicao='" + instituicao + '\'' +
                "\n cidade=" + cidade +
                '}';
    }
}
