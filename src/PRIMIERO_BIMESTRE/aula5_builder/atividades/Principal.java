package PRIMIERO_BIMESTRE.aula5_builder.atividades;

public class Principal {
    public static void main(String[] args) {

        BuilderEsportivo carroEsportivo = new BuilderEsportivo();
        carroEsportivo.setCapacidadeTanque(75);
        carroEsportivo.setMotorVolume(2500);
        carroEsportivo.setGpsMarca("Philco");
        carroEsportivo.setGpsModelo("2343cxxads");
        carroEsportivo.setMotorKilometragem(2321);
        carroEsportivo.setMotorPotencia(321);
        carroEsportivo.setTransmissaoQuantMarchas(6);

        Carro esportivo = carroEsportivo.get();

        System.out.println(esportivo.toString());

        esportivo.getMotor().andar(10);
        esportivo.getMotor().ligar();
        esportivo.getMotor().andar(100);

        System.out.println(esportivo.toString());


//        BuilderEsportivo carroEsportivo2 = new BuilderEsportivo();
//        carroEsportivo2.setCapacidadeTanque(70);
//        carroEsportivo2.setMotorVolume(2511);
//        carroEsportivo2.setGpsMarca("Fiat Palio");
//        carroEsportivo2.setGpsRota("2343cccee");
//        carroEsportivo2.setMotorKilometragem(24214);
//        carroEsportivo2.setMotorPotencia(121);
//        carroEsportivo2.setTransmissaoQuantMarchas(6);
//
//        Carro esportivo2 = carroEsportivo.get();
//
//        System.out.println(esportivo2);




    }
}
