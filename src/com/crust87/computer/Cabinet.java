package com.crust87.computer;

public class Cabinet extends CompositeEquipment {

	public Cabinet(String name) {
		super(name);
	}

	@Override
	public int power() {
		return 0;
	}

}
