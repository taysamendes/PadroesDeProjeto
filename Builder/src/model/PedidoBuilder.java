package model;

public abstract class PedidoBuilder {

	protected Pedido pedido;

	public PedidoBuilder() {
		pedido = new Pedido();
	}

	public abstract void buildSanduiche();

	public abstract void buildBatata();

	public abstract void buildBrinquedo();

	public abstract void buildRefrigerante();

	public Pedido getPedido() {
		return pedido;
	}
}
