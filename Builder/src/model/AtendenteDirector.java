package model;

public class AtendenteDirector {

	protected PedidoBuilder funcionario;

	public AtendenteDirector(PedidoBuilder funcionario) {
		this.funcionario = funcionario;
	}

	public void montarPedido() {
		funcionario.buildSanduiche();
		funcionario.buildBatata();
		funcionario.buildBrinquedo();
		funcionario.buildRefrigerante();

	}
	
	public Pedido getPedido() {
		return funcionario.getPedido();
	}

}
