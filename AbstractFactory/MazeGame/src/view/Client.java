package view;

import controller.AbstractMazeFactory;
import controller.EnchantedMazeFactory;
import controller.SimpleMazeFactory;
import model.Maze;

public class Client {
	
	private static Maze createMaze(String type) {
		AbstractMazeFactory mf = null;
		
		if (type.compareTo("simple maze") == 0)
			mf = new SimpleMazeFactory();
		
		else if (type.compareTo("enchanted maze") == 0)
			mf = new EnchantedMazeFactory();
		
		Maze m = new Maze();
		m.setDoor(mf.makeDoor());
		m.setRoom(mf.makeRoom());
		m.setWall(mf.makeWall());
		return m;
	}
	
	public static void main(String[] args) {
		//Maze m1 = createMaze("simple maze");
		Maze m2 = createMaze("enchanted maze");

	}
}
