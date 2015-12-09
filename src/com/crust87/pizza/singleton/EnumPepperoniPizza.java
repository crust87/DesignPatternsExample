package com.crust87.pizza.singleton;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.dough.ThinDough;
import com.crust87.pizza.ham.Ham;
import com.crust87.pizza.ham.Pepperoni;

/**
 * It's only example of Singleton Pattern user enumeration
 * @author mabi
 *
 */
public enum EnumPepperoniPizza {
	INSTANCE;

	public Pizza createPizza() {
		Pizza lPizza = makePizza();
		
		lPizza.setDough(makeDough());
		lPizza.setHam(makeHam());
		lPizza.addCheeze(makeCheeze());
		lPizza.addCheeze(makeCheeze());
		lPizza.addCheeze(makeCheeze());
		
		return lPizza;
	}
	
	protected Pizza makePizza() {
		return new Pizza();
	}
	
	protected Dough makeDough() {
		return new ThinDough();
	}
	
	protected Cheeze makeCheeze() {
		return new PlainCheeze();
	}
	
	protected Ham makeHam() {
		return new Pepperoni();
	}
}
