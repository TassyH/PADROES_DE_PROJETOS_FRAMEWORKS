package SEGUNDO_BIMESTRE.observer.trabalho;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        EditoraConcreta editoraConcreta1 = new EditoraConcreta();

        Scanner scan = new Scanner(System.in);
        int assunto;
        boolean laco = true;
        int opcao;

        while (laco) {
            System.out.println("Deseja cadastrar um assinante?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("Informe o nome do assinante:");
                String nome = scan.next();
                AssinanteContreto assinanteContreto = new AssinanteContreto(nome);

                System.out.println("Qual assinatura deseja:");
                System.out.println("1 - Esporte");
                System.out.println("2 - Politica");
                System.out.println("3 - Finanças");
                assunto = scan.nextInt();
                scan.nextLine();

                editoraConcreta1.assinarEditora(assinanteContreto, assunto);

            } else {
                laco = false;
            }
        }

        System.out.println("");

        System.out.println("Informe a mensagem de ESPORTE:");
        scan.nextLine();
        String msgEsporte = scan.nextLine();
        editoraConcreta1.notificarAssinantes(msgEsporte, 1);

        System.out.println("Informe a mensagem de POLITICA:");
        String msgPolitica = scan.nextLine();
        editoraConcreta1.notificarAssinantes(msgPolitica, 2);

        System.out.println("Informe a mensagem de FINANÇAS:");
        String msgFinancas = scan.nextLine();
        editoraConcreta1.notificarAssinantes(msgFinancas, 3);

        System.out.println("Notificacoes enviadas bye bye.");
    }
}
