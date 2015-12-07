package com.crust87.pizza.prototype;

import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public class ProtoTypePizzaFactory extends PizzaFactory {
	
	private Dough protoTypeDough;
	private Cheeze protoTypeCheeze;
	private Ham protoTypeHam;
	
	public ProtoTypePizzaFactory(Dough protoTypeDough, Cheeze protoTypeCheeze, Ham protoTypeHam) {
		super();
		this.protoTypeDough = protoTypeDough;
		this.protoTypeCheeze = protoTypeCheeze;
		this.protoTypeHam = protoTypeHam;
	}

	@Override
	public Dough makeDough() {
		return protoTypeDough.copy();
	}

	@Override
	public Cheeze makeCheeze() {
		return protoTypeCheeze.copy();
	}

	@Override
	public Ham makeHam() {
		return protoTypeHam.copy();
	}

}
