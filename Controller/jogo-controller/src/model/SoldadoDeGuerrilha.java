package model;

public class SoldadoDeGuerrilha extends Inimigo {
	public SoldadoDeGuerrilha(){
		super(5,8,8);
	}
	
	@Override
	public int matarInimigo() {
		return 100;
	}
	
	@Override
	public String toString() {
		return "Soldado de guerrilha";
	}

}
