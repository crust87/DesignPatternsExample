package com.crust87.maze.mapsite.room;

import com.crust87.maze.Spell;

public class EnchantedRoom extends Room {
	
	protected Spell mSpell;

	public EnchantedRoom(EnchantedRoom other) {
		super(other);
		
		mSpell = other.mSpell;
	}
	
	public EnchantedRoom(int roomNo, Spell spell) {
		super(roomNo);
		
		mSpell = spell;
	}
	
	public void init(int roomNo, Spell spell) {
		super.init(roomNo);
		
		mSpell = spell;
	}

	@Override
	public Room clone() {
		return new EnchantedRoom(this);
	}
}
