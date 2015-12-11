package com.crust87.maze.patterns.singleton;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.Room.Direction;
import com.crust87.maze.mapsite.wall.Wall;

public class MazeGame {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		Maze maze = null;
		
		// Singleton Pattern
		LazyInitializationMazeFactory enchantedMazeFactory = LazyInitializationMazeFactory.getInstance();
		maze = game.createMaze(enchantedMazeFactory);
		
		System.out.println(maze.toString());
	}
	
	public Maze createMaze(LazyInitializationMazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room room1 = factory.makeRoom(1);
		Room room2 = factory.makeRoom(2);
		Door theDoor = factory.makeDoor(room1, room2);
		
		maze.addRoom(room1);
		maze.addRoom(room2);
		
		room1.setSide(Direction.north, new Wall());
		room1.setSide(Direction.east, theDoor);
		room1.setSide(Direction.south, new Wall());
		room1.setSide(Direction.west, new Wall());
		
		room2.setSide(Direction.north, new Wall());
		room2.setSide(Direction.east, new Wall());
		room2.setSide(Direction.south, new Wall());
		room2.setSide(Direction.west, theDoor);
		
		return maze;
	}
}
