package PRIMIERO_BIMESTRE.aula4.atividades;

public class Impressora {

    private static Impressora impressora;
    private int numeroPagainaImpressas;

    private Impressora(){

    }

    public static Impressora getInstance(){
        if(impressora == null){
            impressora = new Impressora();
        }
        return impressora;
    }

    public void imprime(String texto){
        System.out.println(texto);
        numeroPagainaImpressas ++;
        System.out.println("Numero de paginas: "+numeroPagainaImpressas);
    }


}
