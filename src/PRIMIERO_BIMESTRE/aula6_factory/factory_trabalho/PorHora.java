package PRIMIERO_BIMESTRE.aula6_factory.factory_trabalho;

public class PorHora extends  Empregado{

    private double valor_hora;
    private int quant_horas;

    public PorHora(String nome, String email, int anoContratacao, double valor_hora, int quant_horas) {
        super(nome, email, anoContratacao);
        this.valor_hora = valor_hora;
        this.quant_horas = quant_horas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public int getQuant_horas() {
        return quant_horas;
    }

    public void setQuant_horas(int quant_horas) {
        this.quant_horas = quant_horas;
    }

    @Override
    public String toString() {
        return "PorHora{" +
                "\n valor_hora=" + valor_hora +
                "\n quant_horas=" + quant_horas +
                '}';
    }

    @Override
    public double ganhar() {
        return getValor_hora()*getQuant_horas();
    }
}
