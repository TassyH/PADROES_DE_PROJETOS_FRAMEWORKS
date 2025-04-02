package PRIMIERO_BIMESTRE.aula7.atividade3;

public class ServicoVideoReal implements ServicoVideo{


    @Override
    public void playVideo(String id) {
        System.out.println("Reproduzindo vídeo com o ID: "+id);
    }
}
