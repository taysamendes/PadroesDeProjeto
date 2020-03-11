package view;

import controller.PontuacaoController;
import model.Espiao;
import model.ExercitoInimigo;
import model.Inimigo;
import model.SoldadoDeGuerrilha;

public class App {

	public static void main(String[] args) {
		Inimigo e1 = new SoldadoDeGuerrilha();
		Inimigo e2 = new Espiao();
		Inimigo e3 = new ExercitoInimigo();
		
		PontuacaoController controller = new PontuacaoController();
		
		System.out.println(controller.PontuacaoMorte(e1));
		System.out.println(controller.PontuacaoMorte(e2));
		System.out.println(controller.PontuacaoMorte(e3));


		
	}

}
