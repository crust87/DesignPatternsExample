package com.crust87.maze.patterns.builder;

public abstract class CountingMazeBuilder extends MazeBuilder {

	private int numberOfRooms;
	private int numberOfDoors;
	
	
	public CountingMazeBuilder() {
		numberOfRooms = 0;
		numberOfDoors = 0;
	}

	@Override
	public void buildRoom(int roomNo) {
		numberOfRooms++;
	}

	@Override
	public void buildDoor(int fromRoomNo, int toRoomNo) {
		numberOfDoors++;
	}
}
