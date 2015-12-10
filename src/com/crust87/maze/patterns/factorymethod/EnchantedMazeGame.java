package com.crust87.maze.patterns.factorymethod;

import com.crust87.maze.Maze;
import com.crust87.maze.Spell;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.door.DoorNeedingSpell;
import com.crust87.maze.mapsite.room.EnchantedRoom;
import com.crust87.maze.mapsite.room.Room;

public class EnchantedMazeGame extends MazeGame {

	public static void main(String[] args) {
		EnchantedMazeGame game = new EnchantedMazeGame();
		Maze maze = null;
			
		// Factory Method Pattern
		maze = game.createMaze();
		
		System.out.println(maze.toString());
	}
	
	// Constructors
	public EnchantedMazeGame() {
	}

	@Override
	public Room makeRoom(int roomNo) {
		return new EnchantedRoom(roomNo, new Spell() {
			
			@Override
			public void castSpell() {
				
			}
		});
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}

	
	
}
