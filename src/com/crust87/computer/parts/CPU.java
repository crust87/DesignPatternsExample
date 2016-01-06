package com.crust87.computer.parts;

import com.crust87.computer.core.LeafEquipment;

public class CPU extends LeafEquipment {

	public CPU(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		return -100;
	}

}
