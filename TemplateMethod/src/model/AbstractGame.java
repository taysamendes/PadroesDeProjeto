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

	public void initialize() {}

	public void startPlay() {}

	public void endPlay() {}

	public void play() {}
}
