package SEGUNDO_BIMESTRE.observer.trabalho;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora {

    private List<Assinante> listaAssinantesEsporte = new ArrayList<>();
    private List<Assinante> listaAssinantesPolitica = new ArrayList<>();
    private List<Assinante> listaAssinantesFinancas = new ArrayList<>();


    @Override
    public void assinarEditora(Assinante assinante, int assunto) {
        if(assunto == 1){
            listaAssinantesEsporte.add(assinante);
        }
        else if(assunto == 2){
            listaAssinantesPolitica.add(assinante);
        }else if(assunto == 3){
            listaAssinantesFinancas.add(assinante);
        }
    }

    @Override
    public void cancelarEditora(Assinante assinante, int assunto) {
        if(assunto == 1){
            listaAssinantesEsporte.add(assinante);
        }
        else if(assunto == 2){
            listaAssinantesPolitica.add(assinante);
        }else if(assunto == 3){
            listaAssinantesFinancas.add(assinante);
        }
    }
    @Override
    public void notificarAssinantes(String mensagem, int assunto) {
        if(assunto == 1){
            for(Assinante assinante: listaAssinantesEsporte){
                assinante.publicar(mensagem);
            }
        }
        else if(assunto == 2){
            for(Assinante assinante: listaAssinantesPolitica){
                assinante.publicar(mensagem);
            }
        }else if(assunto == 3){
            for(Assinante assinante: listaAssinantesFinancas){
                assinante.publicar(mensagem);
            }
        }

    }

}
