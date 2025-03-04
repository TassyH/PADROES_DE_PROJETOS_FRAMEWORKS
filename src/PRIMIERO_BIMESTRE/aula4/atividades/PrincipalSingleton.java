package PRIMIERO_BIMESTRE.aula4.atividades;

public class PrincipalSingleton {

    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstancia();
        Singleton sing2 = Singleton.getInstancia();

        if(sing1 == sing2){
            System.out.println("esses objetos sao iguais");
        }else{
            System.out.println("esses objs sao diferentes");
        }

    }

}
