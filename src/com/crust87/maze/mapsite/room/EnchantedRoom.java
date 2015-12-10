package com.crust87.maze.mapsite.room;

import com.crust87.maze.Spell;

public class EnchantedRoom extends Room {
	
	// Components
	protected Spell mSpell;

	// Constructors
	public EnchantedRoom(EnchantedRoom other) {
		super(other);
		
		mSpell = other.mSpell;
	}
	
	public EnchantedRoom(int roomNumber, Spell spell) {
		super(roomNumber);
		
		mSpell = spell;
	}
	
	// Initialization
	public void init(int roomNumber, Spell spell) {
		super.init(roomNumber);
		
		mSpell = spell;
	}

	@Override
	public Room clone() {
		return new EnchantedRoom(this);
	}
}
