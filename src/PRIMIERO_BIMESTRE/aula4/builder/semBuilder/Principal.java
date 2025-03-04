package PRIMIERO_BIMESTRE.aula4.builder.semBuilder;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Telefone tel1 = new Telefone(41,98887570, "celular");
        Telefone tel2 = new Telefone(41, 8977979, "telefone");

        ArrayList <Telefone> listaTel = new ArrayList();
        listaTel.add(tel1);
        listaTel.add(tel2);

        Endereco end1 = new Endereco("Trav. CHile", "111", "rua sem saida", "Cidade jardim", "SJP", "Pr", "BRAS");

        Pessoa p1 = new Pessoa("Robin", "Da silva", 2, 3, 2002, end1,listaTel);

        System.out.println(p1.toString());
    }
}
