package com.crust87.maze.patterns.builder;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.room.Room.Direction;

public class MazeGame {

	public static void main(String[] args) {
		MazeGame game = new MazeGame();
		Maze maze = null;
			
		// Builder Pattern
		StandardMazeBuilder standardmazeBuilder = new StandardMazeBuilder();
		game.createMaze(standardmazeBuilder);
		maze = standardmazeBuilder.getMaze();
		
		System.out.println(maze.toString());
	}
	
	public void createMaze(MazeBuilder builder) {
		builder.buildMazz()
			.putDirection(1, 2, Direction.east)
			.putDirection(2, 1, Direction.west)
			.buildRoom(1)
			.buildRoom(2)
			.buildDoor(1, 2);
	}
}
