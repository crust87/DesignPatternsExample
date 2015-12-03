package com.crust87.pizza.builder;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.NullHam;

/**
 * Builder Pattern 예제
 * 연산을 구현한다.
 * 
 * @author mabi
 *
 */
public class CheezePizzaBuilder extends PizzaBuilder {

	@Override
	public PizzaBuilder buildPizza() {
		mPizza = new Pizza();
		
		return this;
	}

	@Override
	public PizzaBuilder buildDough() {
		mPizza.setDough(new PlainDough());
		
		return this;
	}

	@Override
	public PizzaBuilder buildHam() {
		mPizza.setHam(new NullHam());
		
		return this;
	}

	@Override
	public PizzaBuilder buildCheeze() {
		mPizza.addCheeze(new PlainCheeze());
		
		return this;
	}

}
