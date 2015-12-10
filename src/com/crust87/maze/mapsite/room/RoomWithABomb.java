package com.crust87.maze.mapsite.room;

public class RoomWithABomb extends Room {
	
	public RoomWithABomb(RoomWithABomb other) {
		super(other);
	}

	public RoomWithABomb(int roomNo) {
		super(roomNo);
	}

	@Override
	public Room clone() {
		return new RoomWithABomb(this);
	}
}