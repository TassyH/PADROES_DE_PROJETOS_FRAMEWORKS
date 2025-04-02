package PRIMIERO_BIMESTRE.aula7.atividade1;

public class ProxyMensagem implements Mensagem{

    private MensagemReal msg = new MensagemReal();

    @Override
    public void mostraMensagem() {
        System.out.println("Proxy executa algo ANTES de mensagemReal");
        msg.mostraMensagem();
        System.out.println("Proxy excuta algo APOS de MensagemReal!");
    }
}
