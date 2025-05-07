package PRIMIERO_BIMESTRE.PROVA_1_BIMESTRE.questao_2;

public class ProxyFigura implements Figura {

    FiguraReal figuraReal = new FiguraReal();
    ArquivoSingleton arq1 = ArquivoSingleton.getInstancia();

    @Override
    public double quadrado(double lado) {
        figuraReal.quadrado(lado);
        double calc = lado*lado;
        arq1.gravaArquivo("Calculo realizado");
        return calc;
    }

    @Override
    public double retangulo(double base, double altura) {
        figuraReal.retangulo(base, altura);
        double calc = (base*altura); //A=b⋅h
        arq1.gravaArquivo("Calculo realizado");
        return calc;
    }

    @Override
    public double circulo(double raio) {
        figuraReal.circulo(raio);
        double pi = 3.1415;
        double calc = (pi*(raio*raio));
        arq1.gravaArquivo("Calculo realizado");
        return calc;
    }
}
