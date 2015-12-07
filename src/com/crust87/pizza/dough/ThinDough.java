package com.crust87.pizza.dough;

public class ThinDough extends Dough {

	@Override
	public void cook() {
		System.out.println("cook ThinDough");
	}
	
	@Override
	public Dough copy() {
		Dough lDough = new ThinDough();
		// TODO set some attributes
		return lDough;
	}
}
