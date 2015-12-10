package com.crust87.maze.mapsite.room;

import com.crust87.maze.mapsite.MapSite;

public class Room extends MapSite {
	// Constants
	public static enum Direction {north, east, south, west};
	
	// Components
	private MapSite[] mMapSites;
	
	// Attributes
	private int mRoomNumber;
	
	// Constructors
	public Room() {
		
	}
	
	public Room(Room other) {
		mRoomNumber = other.mRoomNumber;
		mMapSites = new MapSite[Direction.values().length];
	}
	
	public Room(int roomNumber) {
		mRoomNumber = roomNumber;
		mMapSites = new MapSite[Direction.values().length];
	}
	
	// Initialization
	public void init(int roomNumber) {
		mRoomNumber = roomNumber;
	}
	
	public MapSite getSide(Direction direction) {
		return mMapSites[direction.ordinal()];
	}
	
	public void setSide(Direction direction, MapSite mapSite) {
		mMapSites[direction.ordinal()] = mapSite;
	}
	
	@Override
	public void enter() {

	}
	
	@Override
	public Room clone() {
		return new Room(this);
	}
	
	// Getters and Setters
	public int getRoomNo() {
		return mRoomNumber;
	}

}
