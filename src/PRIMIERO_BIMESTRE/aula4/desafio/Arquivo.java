package PRIMIERO_BIMESTRE.aula4.desafio;

import java.io.File;

public class Arquivo {

    private File arquivo;
    private static Arquivo arqSingle;

    private Arquivo(){
        arquivo = new File("texto.txt");

    }

    public Arquivo getArquivoSingle(){
        if(arqSingle== null){
            arqSingle = new Arquivo();
        }
        return arqSingle;
    }
}
