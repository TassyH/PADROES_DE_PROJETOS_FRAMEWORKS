package PRIMIERO_BIMESTRE.aula4.builder.comBuilder;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        PessoaBuilder pessoaBuilder = new PessoaBuilder();
        pessoaBuilder.setNome("Maria", "joaquina");
        pessoaBuilder.setDataNascimento(9, 6, 2002);
        pessoaBuilder.setEndereco("Trav. Chile", "11", "rua sem saida", "cidade jardim", "JSP", "pr" );
        pessoaBuilder.setFone(41, 9887757, "celular");
        pessoaBuilder.setFone(41, 77778777, "Comercial");

        Pessoa pessoa = pessoaBuilder.get();

        System.out.println(pessoa.toString());
    }
}
