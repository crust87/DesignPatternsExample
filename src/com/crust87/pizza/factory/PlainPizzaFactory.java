package com.crust87.pizza.factory;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.Ham;
import com.crust87.pizza.ham.PlainHam;

public class PlainPizzaFactory extends PizzaFactory {

	@Override
	public Pizza makePizza() {
		return new Pizza();
	}

	@Override
	public Dough makeDough() {
		return new PlainDough();
	}

	@Override
	public Cheeze makeCheeze() {
		return new PlainCheeze();
	}

	@Override
	public Ham makeHam() {
		return new PlainHam();
	}
}
