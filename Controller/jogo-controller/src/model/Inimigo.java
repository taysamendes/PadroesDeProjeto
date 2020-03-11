package model;

public abstract class Inimigo {
	private int inteligencia,forca, estrategia;

	public Inimigo(int inteligencia, int forca, int estrategia) {
		super();
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.estrategia = estrategia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}
	
	public abstract int matarInimigo();

	@Override
	public String toString() {
		return "Inimigo [inteligencia= " + inteligencia + ", forca=" + forca + ", estrategia=" + estrategia + "]";
	}
	
	
	
}
