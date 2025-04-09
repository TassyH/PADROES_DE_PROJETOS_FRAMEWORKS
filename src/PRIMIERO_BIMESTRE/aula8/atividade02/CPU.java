package PRIMIERO_BIMESTRE.aula8.atividade02;

public class CPU {

    private double clock;
    private int status;

    public CPU(double clock, int status) {
        this.clock = clock;
        this.status = status;
    }

    public void inicia(){
        System.out.println("inicializao inicial da CPU");
        this.status = 1;
    }

    public void execute(){
        System.out.println("execute algo no processador");
        this.status = 2;
    }

    public void carregar(){
        if(this.status != 2){
            this.status = 2;
        }
        System.out.println("carrega registrador");
    }

    public void libera() {
        System.out.println("libera os registradores");
        this.status = 3;
    }

    public void desliga(){
        System.out.println("desliga CPU");
        this.status = 4;
    }
}
