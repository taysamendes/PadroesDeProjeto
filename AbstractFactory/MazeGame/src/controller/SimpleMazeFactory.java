package controller;

import model.Door;
import model.Maze;
import model.Room;
import model.SimpleDoor;
import model.SimpleMaze;
import model.SimpleRoom;
import model.SimpleWall;
import model.Wall;

public class SimpleMazeFactory extends AbstractMazeFactory {
	
	public Door makeDoor() {
		return new SimpleDoor();
	}
	
	public Room makeRoom() {
		return new SimpleRoom();
	}
	
	public Wall makeWall() {
		return new SimpleWall();
	}
	
	public Maze makeMaze() {
		return new SimpleMaze();
	}
}
