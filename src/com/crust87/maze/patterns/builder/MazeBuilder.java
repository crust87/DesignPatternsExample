package com.crust87.maze.patterns.builder;

import java.util.HashMap;
import java.util.Map;

import com.crust87.maze.Maze;
import com.crust87.maze.Pair;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.Room.Direction;

public abstract class MazeBuilder {
	
	final Map<Pair<Integer, Integer>, Direction> directionMap = new HashMap<Pair<Integer, Integer>, Direction>();
	
	// Constructors
	protected MazeBuilder() {
	}
	
	public MazeBuilder putDirection(int roomNumber1, int roomNumber2, Direction direction) {
		directionMap.put(Pair.create(roomNumber1, roomNumber2), direction);
		
		return this;
	}
	
	protected Direction commonWall(Room room1, Room room2) {
		return directionMap.get(Pair.create(room1.getRoomNo(), room2.getRoomNo()));
	}

	// with Method chaining
	public abstract MazeBuilder buildMazz();
	public abstract MazeBuilder buildRoom(int roomNo);
	public abstract MazeBuilder buildDoor(int fromRoomNo, int toRoomNo);
	public abstract Maze getMaze();
}
