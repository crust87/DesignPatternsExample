package com.crust87.pizza.ham;

import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.dough.ThinDough;

public class Pepperoni extends Ham {

	@Override
	public void cook() {
		System.out.println("cook Pepperoni");
	}

	@Override
	public Ham copy() {
		Ham lHam = new Pepperoni();
		// TODO set some attributes
		return lHam;
	}
}
