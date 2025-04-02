package PRIMIERO_BIMESTRE.aula6.factory_atividades.ativ1;

public class Principal {

    public static void main(String[] args) {
        Sorvete sorvet1 = SorveteFactory.get(0);
        System.out.println(sorvet1.fazerSorvete());

        Sorvete sorv2 = SorveteFactory.get(1);
        System.out.println(sorv2.fazerSorvete());

        Sorvete sorv3 = SorveteFactory.get(2);
        System.out.println(sorv3.fazerSorvete());
    }
}
