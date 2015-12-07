package com.crust87.pizza.dough;

public class PlainDough extends Dough {

	@Override
	public void cook() {
		System.out.println("cook PlainDough");
	}

	@Override
	public Dough copy() {
		Dough lDough = new PlainDough();
		// TODO set some attributes
		return lDough;
	}
}
