package com.crust87.pizza.factory;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

/**
 * Abstract Factory Pattern 예제
 * 기본 연산을 정의한다.
 * 
 * @author mabi
 *
 */
public abstract class PizzaFactory {
	
	public Pizza makePizza() {
		return new Pizza();
	}
	
	public abstract Dough makeDough();
	public abstract Cheeze makeCheeze();
	public abstract Ham makeHam();
}
