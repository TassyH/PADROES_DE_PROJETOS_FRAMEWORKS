package SEGUNDO_BIMESTRE.observer.atividade;

public class AssinanteContreto implements Assinante{

    private String nome;

    public AssinanteContreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void publicar(String mensagem) {
        System.out.println("Assinante: "+this.nome+ " recebeu a mensagem "+mensagem);
    }
}
