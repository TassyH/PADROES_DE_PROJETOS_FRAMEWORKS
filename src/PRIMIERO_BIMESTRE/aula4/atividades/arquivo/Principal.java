package PRIMIERO_BIMESTRE.aula4.atividades.arquivo;

public class Principal {

	public static void main(String[] args) {
		Arquivo arq1 = Arquivo.getInstancia();
		Arquivo arq2 = Arquivo.getInstancia();


		arq1.gravaArquivo("teste de novo arquivo");
		arq1.gravaArquivo("tente outra vez");

		arq2.gravaArquivo("teste 2");



	}

}