package SEGUNDO_BIMESTRE.observer.trabalho;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
         EditoraConcreta editoraConcreta1 = new EditoraConcreta();

        Scanner scan = new Scanner(System.in);
        int assunto = 0;
        System.out.println("Deseja cadastrar um assinante?");
        System.out.println("1 - SIM");
        System.out.println("2 - NAO");
        int opcao = scan.nextInt();

        while (opcao == 1){
            System.out.println("Informe o nome do assinante:");
            String nome = scan.next();
            AssinanteContreto assinanteContreto = new AssinanteContreto(nome);

            System.out.println("Qual assinatura deseja:");
            System.out.println("1 - Esporte");
            System.out.println("2 - Politica");
            System.out.println("3 - Finanças");
            assunto = scan.nextInt();
            editoraConcreta1.assinarEditora(assinanteContreto, assunto);
        }

        System.out.println("Informe a mensagem de ESPORTE:");
        String msgEsporte = scan.next();
        editoraConcreta1.notificarAssinantes(msgEsporte, assunto);
        System.out.println("Informe a mensagem de POLITICA:");
        String msgPolitica = scan.next();
        editoraConcreta1.notificarAssinantes(msgPolitica, assunto);
        System.out.println("Informe a mensagem de FINANÇAS:");
        String msgFinancas = scan.next();
        editoraConcreta1.notificarAssinantes(msgFinancas, assunto);



    }

}
