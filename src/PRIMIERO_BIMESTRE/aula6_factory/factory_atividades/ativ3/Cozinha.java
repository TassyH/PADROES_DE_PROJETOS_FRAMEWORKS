package PRIMIERO_BIMESTRE.aula6_factory.factory_atividades.ativ3;

public class Cozinha {

    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Mark", 'C');
        Cliente cli2 = new Cliente("Enzo", 'V');
        Cliente cli3 = new Cliente("Patricia", 'P');

        Prato p1 = PratoFactory.get(cli1);
        Prato p2 = PratoFactory.get(cli2);
        Prato p3 = PratoFactory.get(cli3);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}
