package com.crust87.maze.patterns.prototype;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.Room.Direction;
import com.crust87.maze.mapsite.wall.Wall;
import com.crust87.maze.patterns.abstractfactory.MazeFactory;

public class MazeGame {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		Maze maze = null;
		
		// Abstract Factory Pattern
		MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(new Maze(), new Wall(), new Room(), new Door());
		maze = game.createMaze(simpleMazeFactory);
	}
	
	public Maze createMaze(MazeFactory factory) {
		Maze aMaze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door theDoor = factory.makeDoor(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.north, new Wall());
		r1.setSide(Direction.east, theDoor);
		r1.setSide(Direction.south, new Wall());
		r1.setSide(Direction.west, new Wall());
		
		r2.setSide(Direction.north, new Wall());
		r2.setSide(Direction.east, new Wall());
		r2.setSide(Direction.south, new Wall());
		r2.setSide(Direction.west, theDoor);
		
		return aMaze;
	}
}
