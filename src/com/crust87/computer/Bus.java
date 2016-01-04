package com.crust87.computer;

public class Bus extends CompositeEquipment {

	public Bus(String name) {
		super(name);
	}

	@Override
	public int power() {
		return 1;
	}

}
