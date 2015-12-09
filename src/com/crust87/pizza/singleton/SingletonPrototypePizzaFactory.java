package com.crust87.pizza.singleton;

import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public class SingletonPrototypePizzaFactory extends PizzaFactory {
	
	private SingletonPrototypePizzaFactory() {}
	
	private Dough prototypeDough;
	private Cheeze prototypeCheeze;
	private Ham prototypeHam;
	
	private static class SingletonPrototypePizaFactoryHolder {
		private static final SingletonPrototypePizzaFactory INSTANCE = new SingletonPrototypePizzaFactory();
	}
	
	public static SingletonPrototypePizzaFactory getInstance() {
		return SingletonPrototypePizaFactoryHolder.INSTANCE;
	}
	
	public void setPrototype(Dough protoTypeDough, Cheeze protoTypeCheeze, Ham protoTypeHam) {
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
