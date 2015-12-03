package com.crust87.pizza.builder;

import com.crust87.pizza.Pizza;

public abstract class PizzaBuilder {
	protected Pizza mPizza;
	
	public abstract PizzaBuilder buildPizza();
	public abstract PizzaBuilder buildDough();
	public abstract PizzaBuilder buildHam();
	public abstract PizzaBuilder buildCheeze();
	
	protected PizzaBuilder() {
	}
	
	public Pizza getPizza() {
		return mPizza;
	}
}
