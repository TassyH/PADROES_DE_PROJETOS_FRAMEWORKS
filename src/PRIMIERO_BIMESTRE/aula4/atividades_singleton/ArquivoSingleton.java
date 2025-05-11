package PRIMIERO_BIMESTRE.aula4.atividades_singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import PRIMIERO_BIMESTRE.aula4.atividades.Singleton;

public class ArquivoSingleton {
	
	private static ArquivoSingleton instancia;
	private File arquivo;
	
	private ArquivoSingleton() {
		arquivo = new File("C:\\Users\\Tassy\\Padroes de Projetos (Dequech)\\PADROES_DE_PROJETOS_FRAMEWORKS\\src\\PRIMIERO_BIMESTRE\\aula4\\atividades_singleton\\texto_teste");

		if (!arquivo.exists()){
			try {
				this.arquivo.createNewFile();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static ArquivoSingleton getInstancia() {
		  if (instancia == null){
	            instancia = new ArquivoSingleton();
	        }
	        return instancia;		
	}
	
	public void gravaArquivo(String texto) {
		FileWriter fileW;
		BufferedWriter bufferW;

		try {
			fileW     = new FileWriter(arquivo, true );
			bufferW   = new BufferedWriter(fileW);

			bufferW.write(texto);
			bufferW.newLine();

			bufferW.close();
			fileW.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
