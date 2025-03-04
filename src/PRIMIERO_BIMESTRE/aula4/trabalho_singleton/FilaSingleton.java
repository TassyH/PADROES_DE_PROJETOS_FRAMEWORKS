package PRIMIERO_BIMESTRE.aula4.trabalho_singleton;

import java.util.ArrayList;

public class FilaSingleton {

    private static FilaSingleton instancia;
    private ArrayList <Usuario> filaUsuario;


    private FilaSingleton(){
        filaUsuario = new ArrayList<>();
    }

    public static FilaSingleton getInstancia(){
        if( instancia == null){
            instancia = new FilaSingleton();
        }
        return instancia;
    }

    public void adicionaUsuario(Usuario user){
        filaUsuario.add(user);
    }
    public Usuario retiraUsuario(){
        return filaUsuario.remove(0);
    }

    public void mostraFila(){
        for (int i = 0; i < filaUsuario.size(); i++){
           // Usuario usario;
           // usario = filaUsuario.get(i);
            System.out.println(filaUsuario.get(i).toString());

        }
    }
}
