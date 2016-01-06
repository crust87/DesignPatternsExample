package com.crust87.computer.parts;

import com.crust87.computer.core.CompositeEquipment;

public class MainBoard extends CompositeEquipment {

	public MainBoard(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		return -100;
	}

}
