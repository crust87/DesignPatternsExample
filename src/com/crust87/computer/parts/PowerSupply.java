package com.crust87.computer.parts;

import com.crust87.computer.core.LeafEquipment;

public class PowerSupply extends LeafEquipment {

	public PowerSupply(String name) {
		super(name);
	}

	@Override
	public int getPower() {
		return 500;
	}
}
