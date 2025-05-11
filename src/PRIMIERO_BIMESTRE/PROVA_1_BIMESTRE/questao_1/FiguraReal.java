package PRIMIERO_BIMESTRE.PROVA_1_BIMESTRE.questao_1;

import PRIMIERO_BIMESTRE.aula4.atividades.arquivo.Arquivo;

public class FiguraReal implements Figura{

    @Override
    public double quadrado(double lado) {
        System.out.println("calculando area do quadrado de lado: "+ lado);
        return 0;
    }

    @Override
    public double retangulo(double base, double altura) {
        System.out.println("calculando area do retangulo de base: "+ base + "e altura: " + altura);
        return 0;
    }

    @Override
    public double circulo(double raio) {
        System.out.println("calculando area do circulo de raio: "+ raio);
        return 0;
    }
}
