package model;

public class ExercitoInimigo extends Inimigo {
	public ExercitoInimigo() {
		super(2,7,10);
	}
	
	@Override
	public int matarInimigo() {
		return 50;
	}
	
	@Override
	public String toString() {
		return "Exercito inimigo";
	}

}
