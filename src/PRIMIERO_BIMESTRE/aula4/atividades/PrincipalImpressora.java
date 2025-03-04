package PRIMIERO_BIMESTRE.aula4.atividades;

public class PrincipalImpressora {

    public static void main(String[] args) {

        Impressora imp1 = Impressora.getInstance();
        imp1.imprime("We get the job done");
        imp1.imprime("we are champions my friend");
        Impressora imp2 = Impressora.getInstance();
        imp2.imprime("texto da maria");
        imp2.imprime("segundo texto da maria");
//
//        Empregado empregado1 = new Empregado("Joao", "joh@gmail.com", "Tester", 3666);
//        Empregado empregado2 = new Empregado("Maria", "maria@gmail.com", "Analista", 3999);
//        Empregado empregado3 = new Empregado("Jose", "jose@gmail.com", "Dev", 4000);

//        empregado1.imprimeEmpregado();
//        empregado2.imprimeEmpregado();

    }

}
