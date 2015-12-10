package com.crust87.maze.patterns.builder;

import com.crust87.maze.Maze;

public abstract class MazeBuilder {
	
	protected MazeBuilder() {
		
	}

	public abstract void buildMazz();
	public abstract void buildRoom(int roomNo);
	public abstract void buildDoor(int fromRoomNo, int toRoomNo);
	public abstract Maze getMaze();
}
