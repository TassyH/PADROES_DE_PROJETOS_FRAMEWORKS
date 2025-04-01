package PRIMIERO_BIMESTRE.aula5.trabalho_builder;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        // a. Nome, data nascimento, cpf, email, endereço e 2 telefones (um celular e um fixo)
        AlunoBuilder alunoBuilder1 = new AlunoBuilder();
        alunoBuilder1.setEndereco("lugradouro residenicial", 12, "complemento residencial", "bairro residencial", "cidade residencial", "RJ", "bRASIL");
        alunoBuilder1.setFone(41, 977878787, "Celular");
        alunoBuilder1.setFone(41, 98888888, "Fixo");
        //alunoBuilder1.setFormacao(2019, "IFPR", "cURITIBA", "Pr" , "Braza");
        alunoBuilder1.setAluno("Ana", "Maria Braga", LocalDate.of(2002, 5, 06), "0425857188", "mariab@gmial.com");

        Aluno aluno = alunoBuilder1.get();
        System.out.println(aluno.toString());

        //b. Nome, data nascimento, cpf, email, endereço, formação e 1 telefone um celular
        AlunoBuilder alunoBuilder2 = new AlunoBuilder();
        alunoBuilder2.setEndereco("lugradouro residenicial", 12, "complemento residencial", "bairro residencial", "cidade residencial", "RJ", "bRASIL");
        alunoBuilder2.setFone(41, 977878787, "Celular");
        alunoBuilder2.setFormacao(2019, "IFPR", "cURITIBA", "Pr" , "Braza");
        alunoBuilder2.setAluno("Relampago", "Marquinhos", LocalDate.of(2002, 5, 06), "0425857188", "mariab@gmial.com");

        Aluno aluno2 = alunoBuilder2.get();
        System.out.println(aluno2.toString());

        //c. Nome, data nascimento, cpf, email, endereço, formação, turma e 2 telefones (um celular e um fixo)
        AlunoBuilder alunoBuilder3 = new AlunoBuilder();
        alunoBuilder3.setEndereco("lugradouro residenicial", 12, "complemento residencial", "bairro residencial", "cidade residencial", "RJ", "bRASIL");
        alunoBuilder3.setFone(41, 977878787, "Celular");
        alunoBuilder3.setFone(41, 98888888, "Fixo");
        alunoBuilder3.setFormacao(2019, "IFPR", "cURITIBA", "Pr" , "Braza");
        alunoBuilder3.setTurma(8, 2023, "melhor turma de ads do senac");
        alunoBuilder3.setAluno("Thomas", "Edson", LocalDate.of(1990, 5, 06), "0425857187", "thomas@gmial.com");

        Aluno aluno3 = alunoBuilder3.get();
        System.out.println(aluno3.toString());
    }
}
