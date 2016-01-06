package com.crust87.computer.parts;

import com.crust87.computer.core.CompositeEquipment;

public class Cabinet extends CompositeEquipment {

	public Cabinet(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		return -10;
	}

}
