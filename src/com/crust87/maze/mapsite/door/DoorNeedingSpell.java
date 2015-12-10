package com.crust87.maze.mapsite.door;

import com.crust87.maze.mapsite.room.Room;

public class DoorNeedingSpell extends Door {

	public DoorNeedingSpell(DoorNeedingSpell other) {
		super(other);
	}
	
	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
	}

	@Override
	public Door clone() {
		return new DoorNeedingSpell(this);
	}
}
