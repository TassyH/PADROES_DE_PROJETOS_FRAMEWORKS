package PRIMIERO_BIMESTRE.aula8.atividade02;

public class Memoria {

    private int tamanho;
    private int ocupada;

    public Memoria(int tamanho, int ocupada) {
        this.tamanho = tamanho;
        this.ocupada = ocupada;
    }

    public void carregar(int posicao, String infor){
        System.out.println("carrega dados da memoria");
        this.ocupada = this.ocupada + infor.length();
    }

    public void liberar(int posicao, String infor){
        System.out.println("libera dados da memoria");
        this.ocupada = this.ocupada - infor.length();
    }

    public String ler(int posicao, int tamanho){
        return "DADOS LIDOS DA MEMORIA";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getOcupada() {
        return ocupada;
    }
}
