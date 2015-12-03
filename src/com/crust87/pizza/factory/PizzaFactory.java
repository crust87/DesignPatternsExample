package com.crust87.pizza.factory;

import com.crust87.pizza.Cheeze;
import com.crust87.pizza.Dough;
import com.crust87.pizza.Ham;
import com.crust87.pizza.Pizza;

public abstract class PizzaFactory {
	
	public abstract Pizza makePizza();
	public abstract Dough makeDough();
	public abstract Cheeze makeCheeze();
	public abstract Ham makeHam();
}
