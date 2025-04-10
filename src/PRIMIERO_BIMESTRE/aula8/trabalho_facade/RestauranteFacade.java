package PRIMIERO_BIMESTRE.aula8.trabalho_facade;

public class RestauranteFacade {

	private Pedido pedido;
	private Estoque estoque;
	private Pagamento pagamento;
	private Notificacao notificacao;
	
	public RestauranteFacade() {
		this.pedido = new Pedido();
		this.estoque = new Estoque();
		this.pagamento = new Pagamento();
		this.notificacao = new Notificacao();
		
	}

	public void fazerPedido(String item, double valor) {

		if(pedido.criarPedido(item)) {
			if(estoque.verificarEstoque(item)) {
				if (pagamento.processarPagamento(item, valor)) {
					notificacao.enviarNotificacao("pagamento realizado, pedido concluido");
				}else{
					notificacao.enviarNotificacao("valor incorreto de pagamento");
				}
			}else{
				notificacao.enviarNotificacao("fora de estoque");
			}
		}else{
			notificacao.enviarNotificacao("item nao achado, deu rim");
		}
		
	}

}
