package PRIMIERO_BIMESTRE.aula4.atividades;

public class Principal {

    public static void main(String[] args) {
        Display.valor = 10;
        Display.mostrar();

        Display disp = new Display();
        disp.incrementarValor();
        Display.mostrar();

        Display disp2 = new Display();
        Display.mostrar();
        disp2.incrementarValor();
        disp2.incrementarValor();
        disp2.incrementarValor();

        disp2.mostrar();


    }
}
