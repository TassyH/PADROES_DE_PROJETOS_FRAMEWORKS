package PRIMIERO_BIMESTRE.aula5_builder.trabalho_builder;

import PRIMIERO_BIMESTRE.aula4.builder.comBuilder.Telefone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoBuilder {

    private Aluno aluno;
    private Cidade cidade;
    private Cidade cidadeFormacao;
    private Endereco endereco;
    private List telefones;
    private Turma turma;
    private Formacao formacao;

    public AlunoBuilder() {
        this.aluno = new Aluno();
        this.cidade = new Cidade();
        this.cidadeFormacao = new Cidade();
        this.endereco = new Endereco();
        //this.enderecoPesoal = new Endereco();
        this.telefones = new ArrayList();
        this.turma = new Turma();
        this.formacao = new Formacao();

        this.aluno.setTurma(turma);
        this.aluno.setEndereco(endereco);
       // this.aluno.setEndereco(enderecoPesoal);
        this.aluno.setFormacao(formacao);
        this.aluno.setTelefones(telefones);

    }

    public void setAluno(String nome, String sobrenome, LocalDate dataNascimento, String cpf, String email){
        this.aluno.setNome(nome);
        this.aluno.setSobrenome(sobrenome);
        this.aluno.setDataNascimento(dataNascimento);
        this.aluno.setCpf(cpf);
        this.aluno.setEmail(email);

    }
    public void setEndereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String pais){
        this.endereco.setLogradouro(logradouro);
        this.endereco.setBairro(bairro);
        this.endereco.setComplemento(complemento);
        this.endereco.setNumero(numero);
        this.cidade.setCidade(cidade);
        this.cidade.setEstado(estado);
        this.cidade.setPais(pais);

        this.endereco.setCidade(this.cidade);
    }
    public void setFormacao(int ano, String instituicao, String cidade, String estado, String pais){
        this.formacao.setAno(ano);
        this.formacao.setInstituicao(instituicao);
        this.cidadeFormacao.setCidade(cidade);
        this.cidadeFormacao.setEstado(estado);
        this.cidadeFormacao.setPais(pais);
        this.formacao.setCidade(this.cidadeFormacao);

    }
    public void setTurma(int numero, int ano, String descricao){
        this.turma.setDescricao(descricao);
        this.turma.setNumero(numero);
        this.turma.setAno(ano);

    }
    public void setFone(int ddd, int numero, String tipoFone){
        this.telefones.add(new Telefone(ddd, numero, tipoFone));

    }

    public Aluno get(){
        return this.aluno;
    }
}
