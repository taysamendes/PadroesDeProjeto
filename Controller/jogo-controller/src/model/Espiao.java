package model;

public class Espiao extends Inimigo{

	public Espiao() {
		super(10,7,10);
	}
	
	@Override
	public int matarInimigo() {
		return 200;
	}

	@Override
	public String toString() {
		return "Espião";
	}


	
	
	
}
