package com.crust87.maze.patterns.prototype;

import com.crust87.maze.Maze;
import com.crust87.maze.mapsite.door.Door;
import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.wall.Wall;
import com.crust87.maze.patterns.abstractfactory.MazeFactory;

public class MazePrototypeFactory extends MazeFactory {
	
	private Maze mPrototypeMaze;
	private Wall mPrototypeWall;
	private Room mPrototypeRoom;
	private Door mPrototypeDoor;

	public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
		mPrototypeMaze = maze;
		mPrototypeWall = wall;
		mPrototypeRoom = room;
		mPrototypeDoor = door;
	}

	@Override
	public Maze makeMaze() {
		return mPrototypeMaze.clone();
	}

	@Override
	public Wall makeWall() {
		return mPrototypeWall.clone();
	}

	@Override
	public Room makeRoom(int roomNo) {
		Room room = mPrototypeRoom.clone();
		room.init(roomNo);
		return room;
	}

	@Override
	public Door makeDoor(Room r1, Room r2) {
		Door door = mPrototypeDoor.clone();
		door.init(r1, r2);
		return door;
	}

	
	
}
