package com.crust87.computer.core;

import java.util.ArrayList;

public abstract class CompositeEquipment extends Equipment {
	
	private ArrayList<Equipment> mEquipments;

	protected CompositeEquipment(String name) {
		super(name);
		mEquipments = new ArrayList<>();
	}

	
	
	@Override
	public int calcPower() {
		int total = 0;
		for(Equipment e: mEquipments) {
			total += e.calcPower();
		}
		
		return total;
	}



	@Override
	public void add(Equipment equipment) {
		mEquipments.add(equipment);
	}

	@Override
	public void remove(Equipment equipment) {
		mEquipments.remove(equipment);
	}

}
