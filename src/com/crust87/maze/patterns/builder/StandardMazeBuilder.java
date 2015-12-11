package com.crust87.maze.patterns.builder;

import java.util.HashMap;
import java.util.Map;

import com.crust87.maze.Maze;
import com.crust87.maze.Pair;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.Room.Direction;
import com.crust87.maze.mapsite.wall.Wall;

public class StandardMazeBuilder extends MazeBuilder {

	// Components
	private Maze mCurrentMaze;
	
	// Constructors
	public StandardMazeBuilder() {
		mCurrentMaze = null;
	}
	
	@Override
	public MazeBuilder buildMazz() {
		mCurrentMaze = new Maze();
		
		return this;
	}

	@Override
	public MazeBuilder buildRoom(int roomNo) {
		if(mCurrentMaze.getRoom(roomNo) == null) {
			Room room = new Room(roomNo);
			mCurrentMaze.addRoom(room);
			
			room.setSide(Direction.north, new Wall());
			room.setSide(Direction.east, new Wall());
			room.setSide(Direction.south, new Wall());
			room.setSide(Direction.west, new Wall());
		}
		
		return this;
	}

	@Override
	public MazeBuilder buildDoor(int fromRoomNo, int toRoomNo) {
		Room r1 = mCurrentMaze.getRoom(fromRoomNo);
		Room r2 = mCurrentMaze.getRoom(toRoomNo);
		Door d = new Door(r1, r2);
		
		r1.setSide(commonWall(r1, r2), d);
		r2.setSide(commonWall(r2, r1), d);
		
		return this;
	}

	@Override
	public Maze getMaze() {
		return mCurrentMaze;
	}

}
