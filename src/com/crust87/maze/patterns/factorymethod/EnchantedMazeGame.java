package com.crust87.maze.patterns.factorymethod;

import com.crust87.maze.Spell;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.door.DoorNeedingSpell;
import com.crust87.maze.mapsite.room.EnchantedRoom;
import com.crust87.maze.mapsite.room.Room;

public class EnchantedMazeGame extends MazeGame {

	public EnchantedMazeGame() {
	}

	@Override
	public Room makeRoom(int roomNo) {
		return new EnchantedRoom(roomNo, new Spell() {
			
			@Override
			public void castSpell() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

	
	
}
