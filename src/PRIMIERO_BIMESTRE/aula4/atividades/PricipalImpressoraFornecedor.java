package PRIMIERO_BIMESTRE.aula4.atividades;

public class PricipalImpressoraFornecedor {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Joao", "joh@gmail.com", "Tester", 3666);
        Empregado empregado2 = new Empregado("Maria", "maria@gmail.com", "Analista", 3999);
        Empregado empregado3 = new Empregado("Jose", "jose@gmail.com", "Dev", 4000);


        empregado1.imprimeEmpregado();
        empregado2.imprimeEmpregado();
        empregado3.imprimeEmpregado();

        Endereco end1 = new Endereco("Rua do John", "bairro do john", 123, "Cidade do John", "Estador do Joehn", "complento do joha");
        Fornecedor for1 = new Fornecedor(1, "Joh", "johbnbnb@gmail.com", end1);
        for1.imprimeFornecedor();

        Endereco end2 = new Endereco("Rua do Mark", "bairro do Mark", 199, "Cidade do Mark", "Estador do Mark", "complento do Mark");
        Fornecedor for2 = new Fornecedor(2, "Mark", "johbnbnb@gmail.com", end2);
        for2.imprimeFornecedor();


    }

}
