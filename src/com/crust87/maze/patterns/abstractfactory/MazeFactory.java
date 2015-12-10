package com.crust87.maze.patterns.abstractfactory;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.wall.Wall;

public class MazeFactory {
	
	public MazeFactory() {
		
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
