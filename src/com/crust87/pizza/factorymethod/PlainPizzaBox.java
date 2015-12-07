package com.crust87.pizza.factorymethod;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.Ham;
import com.crust87.pizza.ham.PlainHam;

public class PlainPizzaBox extends PizzaBox {

	@Override
	protected Pizza makePizza() {
		return new Pizza();
	}

	@Override
	protected Dough makeDough() {
		return new PlainDough();
	}

	@Override
	protected Cheeze makeCheeze() {
		return new PlainCheeze();
	}

	@Override
	protected Ham makeHam() {
		return new PlainHam();
	}

}
