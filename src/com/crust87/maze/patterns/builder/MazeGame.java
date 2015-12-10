package com.crust87.maze.patterns.builder;

import com.crust87.maze.Maze;

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
		builder.buildMazz();
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
	}
}
