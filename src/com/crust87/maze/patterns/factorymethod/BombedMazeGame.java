package com.crust87.maze.patterns.factorymethod;

import com.crust87.maze.mapsite.room.Room;
import com.crust87.maze.mapsite.room.RoomWithABomb;
import com.crust87.maze.mapsite.wall.BombedWall;
import com.crust87.maze.mapsite.wall.Wall;

public class BombedMazeGame extends MazeGame {

	public BombedMazeGame() {
	}

	@Override
	public Room makeRoom(int roomNo) {
		return new RoomWithABomb(roomNo);
	}

	@Override
	public Wall makeWall() {
		return new BombedWall(true);
	}
}
