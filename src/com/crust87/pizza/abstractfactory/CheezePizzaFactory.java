package com.crust87.pizza.abstractfactory;

import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.Ham;
import com.crust87.pizza.ham.NullHam;

/**
 * Abstract Factory Pattern 예제
 * 연산을 구현한다.
 * 
 * @author mabi
 *
 */
public class CheezePizzaFactory extends PizzaFactory {

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
		// Null Object Pattern 사용
		return new NullHam();
	}
}