package controller;

import model.Door;
import model.EnchantedDoor;
import model.EnchantedMaze;
import model.EnchantedRoom;
import model.EnchantedWall;
import model.Maze;
import model.Room;
import model.Wall;

public class EnchantedMazeFactory extends AbstractMazeFactory {
	
	public Door makeDoor() {
		return new EnchantedDoor();
	}
	
	public Room makeRoom() {
		return new EnchantedRoom();
	}
	
	public Wall makeWall() {
		return new EnchantedWall();
	}
	
	public Maze makeMaze() {
		return new EnchantedMaze();
	}
	
}
