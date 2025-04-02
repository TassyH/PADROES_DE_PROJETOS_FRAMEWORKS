package PRIMIERO_BIMESTRE.aula7.atividade3;

public class ProxyServicoVideo implements ServicoVideo {

    ServicoVideoReal real = new ServicoVideoReal();

    private boolean validaPermissao(String videoId){
        if(videoId.length()%2==0){
            return true;
        }else{
            return false;
        }
    }

    public void playVideo( String videoId) {
        if(validaPermissao(videoId)){
            real.playVideo(videoId);
        }else{
            System.out.println("vc nao tem permissa xará para ver esse vídeo");
        }

    }



}
