package PRIMIERO_BIMESTRE.aula8.trabalho_facade;

public class Pedido {

	public boolean criarPedido(String item) {

		if (item.equalsIgnoreCase("Pizza")) {
			System.out.println("Criando pedido para " + item);
			return true;

		} else if (item.equalsIgnoreCase("Lasanha")) {
			System.out.println("Criando pedido para " + item);
			return true;
		} else {
			System.out.println("Pedido não pode ser criado!");
			return false;

			}

		}


}
