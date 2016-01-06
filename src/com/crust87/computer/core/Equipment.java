package com.crust87.computer.core;

public abstract class Equipment {
	
	private String mName;

	protected Equipment(String name) {
		mName = name;
	}
	
	public abstract int getPower();
	public abstract int calcPower();
	
	public abstract void add(Equipment equipment);
	public abstract void remove(Equipment equipment);
	
	public String getName() {
		return mName;
	}

}
