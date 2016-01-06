package com.crust87.computer.parts;

import com.crust87.computer.core.LeafEquipment;

public class Memory extends LeafEquipment {

	public Memory(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		return -10;
	}
}
