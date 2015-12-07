package com.crust87.pizza.cheeze;

public class PlainCheeze extends Cheeze {

	@Override
	public void cook() {
		System.out.println("cook PlainCheeze");
	}

	@Override
	public Cheeze copy() {
		Cheeze lCheeze = new PlainCheeze();
		// TODO set some attributes
		return lCheeze;
	}
}
