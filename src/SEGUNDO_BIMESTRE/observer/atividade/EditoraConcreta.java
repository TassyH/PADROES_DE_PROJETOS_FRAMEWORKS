package SEGUNDO_BIMESTRE.observer.atividade;

import java.util.ArrayList;
import java.util.List;

public class EditoraConcreta implements Editora{

    private List<Assinante> listaAssinantes = new ArrayList<>();
    private String estado; //estado da editora

    @Override
    public void assinarEditora(Assinante assinante) {
        listaAssinantes.add(assinante);
    }

    @Override
    public void cancelarEditora(Assinante assinante) {
        listaAssinantes.remove(assinante);
    }
    @Override
    public void notificarAssinantes(String mensagem) {
        for(Assinante assinante: listaAssinantes){
            assinante.publicar(mensagem);
        }
    }

    public void setEstado(String estado){
        this.estado = estado;
        notificarAssinantes("estado atualizado para: "+estado);
    }
}
