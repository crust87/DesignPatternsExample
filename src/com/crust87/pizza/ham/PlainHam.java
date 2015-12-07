package com.crust87.pizza.ham;

public class PlainHam extends Ham {

	@Override
	public void cook() {
		System.out.println("cook PlainHam");
	}
	
	@Override
	public Ham copy() {
		Ham lHam = new PlainHam();
		// TODO set some attributes
		return lHam;
	}

}
