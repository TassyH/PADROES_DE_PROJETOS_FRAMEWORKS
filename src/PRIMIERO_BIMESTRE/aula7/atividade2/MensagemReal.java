package PRIMIERO_BIMESTRE.aula7.atividade2;

public class MensagemReal implements Mensagem {

    public void mostraMensagem(){
        System.out.println("Algo realizado pelo meu objeto");
    }

    @Override
    public void novaMensagem() {
        System.out.println("garçom, aqui, nessa mesa de bar, voce ja cansou de escutar centenas de casos de amor");
    }
}
