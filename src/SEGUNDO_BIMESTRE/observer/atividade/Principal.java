package SEGUNDO_BIMESTRE.observer.atividade;

public class Principal {

    public static void main(String[] args) {
         EditoraConcreta editoraConcreta1 = new EditoraConcreta();
         AssinanteContreto assinanteContreto1 = new AssinanteContreto("MARIA");
         AssinanteContreto assinanteContreto2 = new AssinanteContreto("JOAO");

         editoraConcreta1.assinarEditora(assinanteContreto1);
         editoraConcreta1.assinarEditora(assinanteContreto2);
         editoraConcreta1.setEstado("Maranhao");
         editoraConcreta1.cancelarEditora(assinanteContreto1);
         editoraConcreta1.setEstado("Pará");

    }

}
