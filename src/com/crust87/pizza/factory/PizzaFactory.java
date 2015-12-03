package com.crust87.pizza.factory;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public abstract class PizzaFactory {
	
	public abstract Pizza makePizza();
	public abstract Dough makeDough();
	public abstract Cheeze makeCheeze();
	public abstract Ham makeHam();
}
