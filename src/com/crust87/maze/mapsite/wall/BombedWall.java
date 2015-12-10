package com.crust87.maze.mapsite.wall;

public class BombedWall extends Wall {
	
	private boolean isBomb;
	
	public BombedWall(boolean isBomb) {
		this.isBomb = isBomb;
	}
	
	public BombedWall(BombedWall other) {
		isBomb = other.isBomb;
	}
	
	@Override
	public Wall clone() {
		return new BombedWall(this);
	}
}