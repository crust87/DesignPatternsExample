package com.crust87.maze.mapsite.door;

import com.crust87.maze.mapsite.MapSite;
import com.crust87.maze.mapsite.room.Room;

public class Door extends MapSite {

	private Room mRoom1;
	private Room mRoom2;
	private boolean isOpen;
	
	public Door() {
		
	}
	
	public Door(Door other) {
		mRoom1 = other.mRoom1;
		mRoom2 = other.mRoom2;
		
		isOpen = other.isOpen;
	}
	
	public Door(Room room1, Room room2) {
		mRoom1 = room1;
		mRoom2 = room2;
	}
	
	public void init(Room room1, Room room2) {
		mRoom1 = room1;
		mRoom2 = room2;
	}
	
	@Override
	public void enter() {

	}
	
	public Room otherSideFrom(Room room) {
		return null;
	}

	@Override
	public Door clone() {
		return new Door(this);
	}
}
