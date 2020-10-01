package model;

public class PedidoUmBuilder extends PedidoBuilder {

	public void buildSanduiche() {
		pedido.setSanduiche("Cheeseburger");
	}

	public void buildBatata() {
		pedido.setBatata("Grande");
	}

	public void buildBrinquedo() {
		pedido.setBrinquedo("Bonequinha");
	}

	public void buildRefrigerante() {
		pedido.setRefrigerante("Guaraná");
	}
}
