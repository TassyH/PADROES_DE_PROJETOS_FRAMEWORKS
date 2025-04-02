package PRIMIERO_BIMESTRE.aula7.atividade3;

public class Principal {
    public static void main(String[] args) {
        ProxyServicoVideo prox1 = new ProxyServicoVideo();

        prox1.playVideo("111");//sem permissao
        prox1.playVideo("1112");///com permissao

        ProxyServicoVideo prox2 = new ProxyServicoVideo();
        prox2.playVideo("1112"); //com permissao



    }
}
