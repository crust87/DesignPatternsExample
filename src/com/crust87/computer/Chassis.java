package com.crust87.computer;

public class Chassis extends CompositeEquipment {

	public Chassis(String name) {
		super(name);
	}

	@Override
	public int power() {
		return 1;
	}

}
