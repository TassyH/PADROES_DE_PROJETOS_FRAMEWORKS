package PRIMIERO_BIMESTRE.aula8.trabalho_facade;

public class Pagamento {

	public boolean processarPagamento(String item, double valor) {

		if (item.equalsIgnoreCase("Pizza") && valor == 80.00) {
			System.out.println("Processando pagamento de R$ " + valor);
			return true;

		} else {
			if (item.equalsIgnoreCase("Lasanha") && valor == 90.00) {
				System.out.println("Processando pagamento de R$ " + valor);
				return true;

			} /*else {
				if (item.equalsIgnoreCase("Esfirra") && valor == 30.00) {
					System.out.println("Processando pagamento de R$ " + valor);
					return true;

				}*/ else {
					System.out.println("Processando de pagamento NÃO realizado!");
					return false;

				}
			}

		}

}
