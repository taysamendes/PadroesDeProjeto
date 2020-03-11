package model;

public class Pontuacao {
	private int pontuacao;

	public Pontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "| Pontuacao: " + pontuacao;
	}
	
	
	
	
}
