package PRIMIERO_BIMESTRE.aula6_factory.factory_atividades.ativ3;


public class PratoFactory {

    public static Prato get (Cliente cliente){
        if (cliente.getPreferencia() == 'V'){
            return new Vegano("Master Chuchu", 50.5, 40.0, 50);
        }else if(cliente.getPreferencia() == 'C'){
            return new Carnivoro("Picanha & maminha", 200, 30, 60);
        }else if(cliente.getPreferencia()=='P'){
            return new Padrao("Prato Feito", 100, 30, 20, 10);
        }else{
            return null;
        }
    }
}
