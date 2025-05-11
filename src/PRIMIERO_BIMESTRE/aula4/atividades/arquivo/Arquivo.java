package PRIMIERO_BIMESTRE.aula4.atividades.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Arquivo {
	
	private File arquivo; 
	private static Arquivo instancia;

	
	private Arquivo() {
		
		arquivo = new File("txt/teste.txt");
		
		if (!arquivo.exists()){ 
			try {
				this.arquivo.createNewFile(); 
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} 
	}
	public static Arquivo getInstancia() {
		if(instancia == null) {
			instancia = new Arquivo();
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