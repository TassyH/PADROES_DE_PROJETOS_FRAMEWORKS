package PRIMIERO_BIMESTRE.PROVA_1_BIMESTRE.questao_2;

public class FiguraReal implements Figura {

    ArquivoSingleton arq1 = ArquivoSingleton.getInstancia();

    @Override
    public double quadrado(double lado) {
        arq1.gravaArquivo("calculando area do quadrado de lado: "+ lado);
        return 0;
    }

    @Override
    public double retangulo(double base, double altura) {
        arq1.gravaArquivo("calculando area do retangulo de base: "+ base + "e altura: " + altura);
        return 0;
    }

    @Override
    public double circulo(double raio) {
        arq1.gravaArquivo("calculando area do circulo de raio: "+ raio);
        return 0;
    }
}
