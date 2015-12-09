package com.crust87.pizza.singleton;

import com.crust87.pizza.factorymethod.PlainPizza;

public class SingletonPlainPizza extends PlainPizza {
	private static final SingletonPlainPizza INSTANCE = new SingletonPlainPizza();
	private SingletonPlainPizza() {}
	
	public static SingletonPlainPizza getInstance() {
        return INSTANCE;
	}
}
