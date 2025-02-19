package PRIMIERO_BIMESTRE.aula1.trabalho;

public class Cliente {

    private String cpf;
    private int anoNascimento;
    private String email;
    private String nome;
    Endereco end;

    public Cliente(String cpf, int anoNascimento, String email, String nome, Endereco end) {
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.nome = nome;
        this.end = end;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", end=" + end +
                '}';
    }
}
