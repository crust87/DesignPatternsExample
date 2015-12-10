package com.crust87.maze.patterns.abstractfactory;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.RoomWithABomb;
import com.crust87.maze.mapsite.wall.BombedWall;
import com.crust87.maze.mapsite.wall.Wall;

public class BombedMazeFactory extends MazeFactory {
	
	public BombedMazeFactory() {
		
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Wall makeWall() {
		return new BombedWall(true);
	}
	
	public Room makeRoom(int roomNo) {
		return new RoomWithABomb(roomNo);
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
