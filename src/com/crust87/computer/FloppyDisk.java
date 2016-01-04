package com.crust87.computer;

public class FloppyDisk extends Equipment {

	public FloppyDisk(String name) {
		super(name);
	}

	@Override
	public int power() {
		return 5;
	}

	@Override
	public int netPrice() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int DiscountPrice() {
		return 1;
	}

	@Override
	public void add(Equipment equipment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Equipment equipment) {
		// TODO Auto-generated method stub
		
	}
	
	

}
