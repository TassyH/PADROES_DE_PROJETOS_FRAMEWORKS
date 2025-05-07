package SEGUNDO_BIMESTRE.observer.atividade;

public interface Editora {

    void assinarEditora(Assinante assinante);
    void cancelarEditora(Assinante assinante);
    void notificarAssinantes(String mensagem);

}
