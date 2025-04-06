package PRIMIERO_BIMESTRE.aula5_builder.trabalho_builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private Formacao formacao;
    private Endereco endereco;
    private Turma turma;
    private List telefones = new ArrayList();
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public List getTelefones() {
        return telefones;
    }

    public void setTelefones(List telefones) {
        this.telefones = telefones;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\n Aluno{" +
                "\n nome='" + nome + '\'' +
                "\n sobrenome='" + sobrenome + '\'' +
                "\n cpf='" + cpf + '\'' +
                "\n email='" + email + '\'' +
                "\n formacao=" + formacao +
                "\n endereco=" + endereco +
                "\n turma=" + turma +
                "\n telefones=" + telefones +
                "\n dataNascimento=" + dataNascimento +
                '}';
    }
}
