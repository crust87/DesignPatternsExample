package com.crust87.maze.patterns.builder;

public abstract class CountingMazeBuilder extends MazeBuilder {

	// Attributes
	private int numberOfRooms;
	private int numberOfDoors;
	
	// Constructors
	public CountingMazeBuilder() {
		numberOfRooms = 0;
		numberOfDoors = 0;
	}

	@Override
	public MazeBuilder buildRoom(int roomNo) {
		numberOfRooms++;
		
		return this;
	}

	@Override
	public MazeBuilder buildDoor(int fromRoomNo, int toRoomNo) {
		numberOfDoors++;
		
		return this;
	}
}
