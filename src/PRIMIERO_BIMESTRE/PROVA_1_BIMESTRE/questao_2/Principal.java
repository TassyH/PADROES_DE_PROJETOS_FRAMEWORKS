package PRIMIERO_BIMESTRE.PROVA_1_BIMESTRE.questao_2;


public class Principal {
    public static void main(String[] args) {
        ProxyFigura proxyFigura = new ProxyFigura();

        System.out.println(proxyFigura.quadrado(10));
        System.out.println("");
        System.out.println(proxyFigura.retangulo(5,2));
        System.out.println("");
        System.out.println(proxyFigura.circulo(1));
    }
}
