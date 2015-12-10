package com.crust87.maze.patterns.factorymethod;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.RoomWithABomb;
import com.crust87.maze.mapsite.wall.BombedWall;
import com.crust87.maze.mapsite.wall.Wall;

public class BombedMazeGame extends MazeGame {
	
	public static void main(String[] args) {
		BombedMazeGame game = new BombedMazeGame();
		Maze maze = null;
			
		// Factory Method Pattern
		maze = game.createMaze();
		
		System.out.println(maze.toString());
	}

	// Constructors
	public BombedMazeGame() {
	}

	@Override
	public Room makeRoom(int roomNo) {
		return new RoomWithABomb(roomNo);
	}

	@Override
	public Wall makeWall() {
		return new BombedWall(true);
	}
}
