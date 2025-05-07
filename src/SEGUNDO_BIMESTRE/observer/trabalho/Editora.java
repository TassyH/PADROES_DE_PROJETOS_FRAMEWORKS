package SEGUNDO_BIMESTRE.observer.trabalho;

public interface Editora {

    void assinarEditora(Assinante assinante, int assunto);
    void cancelarEditora(Assinante assinante, int assunto);
    void notificarAssinantes(String mensagem, int assunto);


}
