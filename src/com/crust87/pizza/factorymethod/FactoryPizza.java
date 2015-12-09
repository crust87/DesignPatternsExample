package com.crust87.pizza.factorymethod;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public abstract class FactoryPizza extends Pizza {
	
	public FactoryPizza() {
		setDough(makeDough());
		setHam(makeHam());
		addCheeze(makeCheeze());
		addCheeze(makeCheeze());
		addCheeze(makeCheeze());
	}
	
	protected abstract Pizza makePizza();
	protected abstract Dough makeDough();
	protected abstract Cheeze makeCheeze();
	protected abstract Ham makeHam();
}
