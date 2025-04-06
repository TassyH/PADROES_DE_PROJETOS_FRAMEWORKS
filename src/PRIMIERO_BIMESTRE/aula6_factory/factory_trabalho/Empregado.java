package PRIMIERO_BIMESTRE.aula6_factory.factory_trabalho;

import java.time.LocalDate;

public abstract class Empregado {

    private String nome;
    private String email;
    private int anoContratacao;

    public Empregado(String nome, String email, int anoContratacao) {
        this.nome = nome;
        this.email = email;
        this.anoContratacao = anoContratacao;
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

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "\n nome='" + nome + ' ' +
                "\n email='" + email + ' ' +
                "\n anoContratacao=" + anoContratacao +
                '}';
    }

    public int tempoCaso(){
        LocalDate data_loc = LocalDate.now();
        int anoAtual = data_loc.getYear();
        return anoAtual - getAnoContratacao();
    }

    public abstract double ganhar();
}
