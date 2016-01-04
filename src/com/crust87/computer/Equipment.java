package com.crust87.computer;

public abstract class Equipment {
	
	private String mName;

	protected Equipment(String name) {
		mName = name;
	}
	
	public abstract int power();
	public abstract int netPrice();
	public abstract int DiscountPrice();
	
	public abstract void add(Equipment equipment);
	public abstract void remove(Equipment equipment);
	
	public String getName() {
		return mName;
	}

}
