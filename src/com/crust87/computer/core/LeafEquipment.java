package com.crust87.computer.core;

public abstract class LeafEquipment extends Equipment {

	public LeafEquipment(String name) {
		super(name);
	}

	@Override
	public int calcPower() {
		return getPower();
	}
	
	@Override
	public void add(Equipment equipment) {
	}

	@Override
	public void remove(Equipment equipment) {
	}
}
