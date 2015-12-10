package com.crust87.maze.mapsite.room;

import com.crust87.maze.mapsite.MapSite;

public class Room extends MapSite {
	public static enum Direction {north, east, south, west};
	
	// Components
	private MapSite[] mMapSites;
	
	// Attributes
	private int mRoomNo;
	
	// Constructor
	public Room() {
		
	}
	
	public Room(Room other) {
		mRoomNo = other.mRoomNo;
		mMapSites = new MapSite[Direction.values().length];
	}
	
	public Room(int roomNo) {
		mRoomNo = roomNo;
		mMapSites = new MapSite[Direction.values().length];
	}
	
	public void init(int roomNo) {
		mRoomNo = roomNo;
	}
	
	public MapSite getSide(Direction direction) {
		return mMapSites[direction.ordinal()];
	}
	
	public void setSide(Direction direction, MapSite mapSite) {
		mMapSites[direction.ordinal()] = mapSite;
	}
	
	public int getRoomNo() {
		return mRoomNo;
	}
	
	@Override
	public void enter() {

	}
	
	@Override
	public Room clone() {
		return new Room(this);
	}

}
