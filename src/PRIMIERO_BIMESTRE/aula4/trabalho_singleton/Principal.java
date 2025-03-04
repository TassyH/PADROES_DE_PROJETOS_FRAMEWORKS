package PRIMIERO_BIMESTRE.aula4.trabalho_singleton;

public class Principal {
    public static void main(String[] args) {
        FilaSingleton atendente_recepcionista = FilaSingleton.getInstancia();
        FilaSingleton atendente_01 = FilaSingleton.getInstancia();
        FilaSingleton atendente_02 = FilaSingleton.getInstancia();

        Usuario usr01 = new Usuario(1, "Raul Seixas");
        Usuario usr02 = new Usuario(2, "Cazuza");
        Usuario usr03 = new Usuario(3, "Elis Regina");
        Usuario usr04 = new Usuario(4, "Pralamas do Sucesso");
        Usuario usr05 = new Usuario(5, "Engenheiros do Hawaii");
        Usuario usr06 = new Usuario(6, "Roupa Nova");




        atendente_recepcionista.adicionaUsuario(usr01);

        atendente_recepcionista.adicionaUsuario(usr02);

        atendente_recepcionista.adicionaUsuario(usr03);
        atendente_recepcionista.adicionaUsuario(usr04);
        atendente_recepcionista.adicionaUsuario(usr05);
        atendente_recepcionista.adicionaUsuario(usr06);
        atendente_recepcionista.mostraFila();

        System.out.println(" ......... LISTA ATUALIZADA COM AS REMOVÇÕES v1.........");
        atendente_01.retiraUsuario();
        atendente_01.mostraFila();

        System.out.println(" ......... LISTA ATUALIZADA COM AS REMOVÇÕES v2.........");

        atendente_02.retiraUsuario();
        atendente_02.mostraFila();



    }
}
