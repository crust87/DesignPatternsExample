package com.crust87.pizza.factorymethod;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public abstract class PizzaBox {
	
	public Pizza createPizza() {
		Pizza lPizza = makePizza();
		
		lPizza.setDough(makeDough());
		lPizza.setHam(makeHam());
		lPizza.addCheeze(makeCheeze());
		lPizza.addCheeze(makeCheeze());
		lPizza.addCheeze(makeCheeze());
		
		return lPizza;
	}
	
	protected abstract Pizza makePizza();
	protected abstract Dough makeDough();
	protected abstract Cheeze makeCheeze();
	protected abstract Ham makeHam();
}
