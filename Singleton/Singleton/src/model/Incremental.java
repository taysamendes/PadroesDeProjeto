package model;

public class Incremental {

	private int count;

	// Atributo da propria classe
	private static Incremental instance = new Incremental();

	// Construtor privado
	private Incremental() {
	}

	// Implementacao do metodo getInstance()
	public static synchronized Incremental getInstance() {
		return instance;
	}

	public String toString() {
		return "Incremental " + count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
