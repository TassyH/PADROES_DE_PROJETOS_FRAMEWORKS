package PRIMIERO_BIMESTRE.PROVA_1_BIMESTRE.questao_1;

public class ProxyFigura implements Figura{

    FiguraReal figuraReal = new  FiguraReal();
    @Override
    public double quadrado(double lado) {
        figuraReal.quadrado(lado);
        double calc = lado*lado;
        System.out.println("Calculo realizado");
        return calc;
    }

    @Override
    public double retangulo(double base, double altura) {
        figuraReal.retangulo(base, altura);
        double calc = (base*altura); //A=b⋅h
        System.out.println("Calculo realizado");
        return calc;
    }

    @Override
    public double circulo(double raio) {
        figuraReal.circulo(raio);
        double pi = 3.1415;
        double calc = (pi*(raio*raio));
        System.out.println("Calculo realizado");
        return calc;
    }
}
