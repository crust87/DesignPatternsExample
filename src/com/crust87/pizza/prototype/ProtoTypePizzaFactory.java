package com.crust87.pizza.prototype;

import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public class PrototypePizzaFactory extends PizzaFactory {
	
	private Dough prototypeDough;
	private Cheeze prototypeCheeze;
	private Ham prototypeHam;
	
	public PrototypePizzaFactory(Dough protoTypeDough, Cheeze protoTypeCheeze, Ham protoTypeHam) {
		super();
		this.prototypeDough = protoTypeDough;
		this.prototypeCheeze = protoTypeCheeze;
		this.prototypeHam = protoTypeHam;
	}

	@Override
	public Dough makeDough() {
		return prototypeDough.copy();
	}

	@Override
	public Cheeze makeCheeze() {
		return prototypeCheeze.copy();
	}

	@Override
	public Ham makeHam() {
		return prototypeHam.copy();
	}
}
