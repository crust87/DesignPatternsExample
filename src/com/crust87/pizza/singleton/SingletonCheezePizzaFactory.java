package com.crust87.pizza.singleton;

import com.crust87.pizza.abstractfactory.CheezePizzaFactory;

public class SingletonCheezePizzaFactory extends CheezePizzaFactory {

	private SingletonCheezePizzaFactory() {
		
	}
	
	private static class SingletonCheezePizaFactoryHolder {
		private static final SingletonCheezePizzaFactory INSTANCE = new SingletonCheezePizzaFactory();
	}
	
	public static SingletonCheezePizzaFactory getInstance() {
		return SingletonCheezePizaFactoryHolder.INSTANCE;
	}
}
