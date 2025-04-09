package PRIMIERO_BIMESTRE.aula5_builder.trabalho_builder;

public class Endereco {

    private String logradouro;
    private String complemento;
    private String bairro;
    private int numero;
    private Cidade cidade;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n Endereco{" +
                "\n logradouro='" + logradouro + '\'' +
                "\n complemento='" + complemento + '\'' +
                "\n bairro='" + bairro + '\'' +
                "\n numero=" + numero +
                "\n cidade=" + cidade +
                '}';
    }
}
