package model;

public class PedidoDoisBuilder extends PedidoBuilder{
	public void buildSanduiche() {
		pedido.setSanduiche("Hambúrguer");
	}

	public void buildBatata() {
		pedido.setBatata("Pequena");
	}

	public void buildBrinquedo() {
		pedido.setBrinquedo("Carrinho");
	}

	public void buildRefrigerante() {
		pedido.setRefrigerante("Guaraná");
	}

}
