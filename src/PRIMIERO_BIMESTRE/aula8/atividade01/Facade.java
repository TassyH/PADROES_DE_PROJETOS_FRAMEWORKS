package PRIMIERO_BIMESTRE.aula8.atividade01;

public class Facade {

    private SubSistemaA subA;
    private SubSistemaB subB;
    private SubSistemaC subC;
    private SubSistemaD subD;

    public Facade(){
        this.subA = new SubSistemaA();
        this.subB = new SubSistemaB();
        this.subC = new SubSistemaC();
        this.subD = new SubSistemaD();
    }

    public void executarTarefa(){
        this.subA.operacaoA();
        this.subB.operacaoB();
        this.subC.operacaoC();
        this.subD.operacaoD();
    }

    public void concluirTarefa(){
        this.subA.operacaoA1();
        this.subB.operacaoB1();
        this.subC.operacaoC1();
        this.subD.operacaoD1();
    }

}
