package com.crust87.pizza.builder;

import com.crust87.pizza.Pepperoni;
import com.crust87.pizza.Pizza;
import com.crust87.pizza.PlainCheeze;
import com.crust87.pizza.ThinDough;

public class PepperoniPizzaBuilder extends PizzaBuilder {

	@Override
	public PizzaBuilder buildPizza() {
		mPizza = new Pizza();
		
		return this;
	}

	@Override
	public PizzaBuilder buildDough() {
		mPizza.setDough(new ThinDough());
		
		return this;
	}

	@Override
	public PizzaBuilder buildHam() {
		mPizza.setHam(new Pepperoni());
		
		return this;
	}

	@Override
	public PizzaBuilder buildCheeze() {
		mPizza.addCheeze(new PlainCheeze());
		
		return this;
	}

}
