package view;

import model.AtendenteDirector;
import model.Pedido;
import model.PedidoUmBuilder;

public class Cliente {

	public static void main(String[] args) {
		AtendenteDirector funcionario = new AtendenteDirector(new PedidoUmBuilder());
		funcionario.montarPedido();
		
		Pedido pedido = funcionario.getPedido();
		
		System.out.println("Sanduíche: "+pedido.getSanduiche() + "\nBatata: "+pedido.getBatata()
		+"\nBrinquedo:" +pedido.getBrinquedo()+"\nRefrigerante: "+pedido.getRefrigerante());

		System.out.println("-----------------------------------------------");
		

	}

}
