package com.crust87.pizza.builder;

import com.crust87.pizza.Pizza;

/**
 * Builder Pattern 예제
 * 기본 연산을 정의한다.
 * 
 * @author mabi
 *
 */
public abstract class PizzaBuilder {
	protected Pizza mPizza;
	
	// PizzaBuilder를 return 함으로 Method Chaining을 구현할수 있다.
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
