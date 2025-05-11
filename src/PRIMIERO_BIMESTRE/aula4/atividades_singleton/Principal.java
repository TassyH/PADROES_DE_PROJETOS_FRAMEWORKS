package PRIMIERO_BIMESTRE.aula4.atividades_singleton;

public class Principal {
	
	public static void main(String[] args) {
		
		ArquivoSingleton aplic01 = ArquivoSingleton.getInstancia();
		ArquivoSingleton aplic02 = ArquivoSingleton.getInstancia();
		
		aplic01.gravaArquivo("teste 01");
		aplic01.gravaArquivo("teste 2 - gostosa");
		
		aplic02.gravaArquivo("teste03 - asas");

		
	}
	
	

}
