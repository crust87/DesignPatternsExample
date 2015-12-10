package com.crust87.maze.patterns.factorymethod;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.Room.Direction;
import com.crust87.maze.mapsite.wall.Wall;

public class MazeGame {

	public Maze createMaze() {
		Maze aMaze = makeMaze();
		
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door theDoor = makeDoor(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.north, new Wall());
		r1.setSide(Direction.east, theDoor);
		r1.setSide(Direction.south, new Wall());
		r1.setSide(Direction.west, new Wall());
		
		r2.setSide(Direction.north, new Wall());
		r2.setSide(Direction.east, new Wall());
		r2.setSide(Direction.south, new Wall());
		r2.setSide(Direction.west, theDoor);
		
		
		return aMaze;
	}
	
	public Maze makeMaze() {
		return new Maze();
	}
	
	public Room makeRoom(int roomNo) {
		return new Room(roomNo);
	}
	
	public Wall makeWall() {
		return new Wall();
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
}
