package view;

import model.Pessoa;
import model.SaudacaoFabrica;

public class App {
	public static void main(String[] args) {
		
		SaudacaoFabrica fb1 = new SaudacaoFabrica("f");
		SaudacaoFabrica fb2 = new SaudacaoFabrica("m");
		SaudacaoFabrica fb3 = new SaudacaoFabrica("");


		Pessoa p1 = fb1.getSaudar("Taysa");
		Pessoa p2 = fb2.getSaudar("Pedro");
		Pessoa p3 = fb3.getSaudar("Douglas");

		System.out.println(p1.saudar());
		System.out.println(p2.saudar());
		System.out.println(p3.saudar());
	}
}
