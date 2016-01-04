package com.crust87.computer;

import java.util.ArrayList;

public abstract class CompositeEquipment extends Equipment {
	
	private ArrayList<Equipment> mEquipments;

	protected CompositeEquipment(String name) {
		super(name);
		mEquipments = new ArrayList<>();
	}

	@Override
	public int netPrice() {
		int total = 0;
		
		for(Equipment e: mEquipments) {
			total += e.netPrice();
		}
		
		return total;
	}

	@Override
	public int DiscountPrice() {
		int total = 0;
		
		for(Equipment e: mEquipments) {
			total += e.DiscountPrice();
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
