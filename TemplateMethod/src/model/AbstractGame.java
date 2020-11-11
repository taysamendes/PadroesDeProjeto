package model;

public abstract class AbstractGame {

	public AbstractGame() {
		templateMethod();
	}

	public final void templateMethod() {
		initialize();
		startPlay();
		play();
		endPlay();
	}

	public void initialize() {
		System.out.println("Initialize");
	}

	public void startPlay() {
		System.out.println("Start Play");
	}

	public void endPlay() {
		System.out.println("End Play");
	}

	public abstract void play();
}
