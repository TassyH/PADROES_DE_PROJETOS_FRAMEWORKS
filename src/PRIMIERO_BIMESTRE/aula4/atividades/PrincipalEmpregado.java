package PRIMIERO_BIMESTRE.aula4.atividades;

public class PrincipalEmpregado {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado("Joao", "joh@gmail.com", "Tester", 3666);
        Empregado empregado2 = new Empregado("Maria", "maria@gmail.com", "Analista", 3999);
        Empregado empregado3 = new Empregado("Jose", "jose@gmail.com", "Dev", 4000);


        empregado1.imprimeEmpregado();
        empregado2.imprimeEmpregado();
        empregado3.imprimeEmpregado();

    }

}
