package com.crust87.maze.patterns.abstractfactory;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.RoomWithABomb;
import com.crust87.maze.mapsite.wall.BombedWall;
import com.crust87.maze.mapsite.wall.Wall;

public class BombedMazeFactory extends MazeFactory {
	
	// Constructors
	public BombedMazeFactory() {
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new BombedWall(true);
	}
	
	public Room makeRoom(int roomNumber) {
		return new RoomWithABomb(roomNumber);
	}
	
	public Door makeDoor(Room fromRoom, Room toRoom) {
		return new Door(fromRoom, toRoom);
	}
}
