package com.crust87.maze.mapsite.wall;

public class BombedWall extends Wall {
	
	// Attributes
	private boolean isBomb;
	
	// Constructors
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