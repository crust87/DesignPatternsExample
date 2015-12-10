package com.crust87.maze.patterns.abstractfactory;

import com.crust87.maze.Maze;
import com.crust87.maze.Spell;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.door.DoorNeedingSpell;
import com.crust87.maze.mapsite.room.EnchantedRoom;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.wall.Wall;

public class EnchantedMazeFactory extends MazeFactory {
	
	// Constructors
	public EnchantedMazeFactory() {
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Room makeRoom(int roomNo) {
		return new EnchantedRoom(roomNo, new Spell() {
			
			@Override
			public void castSpell() {
				
			}
		});
	}
	
	public Door makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}
}
