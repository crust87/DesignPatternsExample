package com.crust87.maze.mapsite.room;

public class RoomWithABomb extends Room {
	
	// Constructors
	public RoomWithABomb(int roomNumber) {
		super(roomNumber);
	}
	
	public RoomWithABomb(RoomWithABomb other) {
		super(other);
	}

	@Override
	public Room clone() {
		return new RoomWithABomb(this);
	}
}