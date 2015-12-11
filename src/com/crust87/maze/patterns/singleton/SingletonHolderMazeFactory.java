package com.crust87.maze.patterns.singleton;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.wall.Wall;

public class SingletonHolderMazeFactory {
	
	// Constructors
	protected SingletonHolderMazeFactory() {
	}

	private static class SingletonHolderMazeFactoryHolder {
		private static final SingletonHolderMazeFactory INSTANCE = new SingletonHolderMazeFactory();
	}
	
	public static SingletonHolderMazeFactory getInstance() {
		return SingletonHolderMazeFactoryHolder.INSTANCE;
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Room makeRoom(int roomNumber) {
		return new Room(roomNumber);
	}
	
	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}
}
