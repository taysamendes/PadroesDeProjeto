package controller;

import model.Inimigo;
import model.Pontuacao;

public class PontuacaoController {
	
	public String PontuacaoMorte(Inimigo inimigo) {
		Pontuacao ponto = new Pontuacao(inimigo.matarInimigo());
		return "Matou: "+ inimigo +" " + ponto;
	}
}
