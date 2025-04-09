package PRIMIERO_BIMESTRE.aula8.atividade02;

public class HD {

    private int capacidade;

    public HD(int capacidade) {
        this.capacidade = capacidade;
    }

    public int get(){
        return this.capacidade;
    }

    public String ler(int posicaoInicial, int size){
        System.out.println("ler dados do HD");
        return "INFORMACAO LIDA DO HD";
    }

    public void escrever(int posicao, String infor){
        System.out.println("escrever dados no HD");
        System.out.println("Posicao: "+posicao);
        System.out.println("Informacao: "+infor);
    }
}
