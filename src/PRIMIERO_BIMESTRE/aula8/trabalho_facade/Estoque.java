package PRIMIERO_BIMESTRE.aula8.trabalho_facade;

public class Estoque {

	public boolean verificarEstoque(String item) {

		if (item.equalsIgnoreCase("Pizza")) {
			System.out.println("Verificando estoque para " + item);
			return true;

		} else if (item.equalsIgnoreCase("Lasanha")) {
			System.out.println("Verificando estoque para " + item);
			return true;
		} else {
				System.out.println("Pedido não pode ser criado pq nao tem estoque!");
				return false;

			}


	}

}
