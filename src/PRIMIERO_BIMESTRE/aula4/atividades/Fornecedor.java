package PRIMIERO_BIMESTRE.aula4.atividades;

public class Fornecedor {

    private int codigo;
    private String nome;
    private String email;
    private Endereco end;

    public Fornecedor(int codigo, String nome, String email, Endereco end) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.end = end;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", end=" + end +
                '}';
    }

    public void imprimeFornecedor(){
        Impressora imp = Impressora.getInstance();
        imp.imprime(toString());

    }
}
