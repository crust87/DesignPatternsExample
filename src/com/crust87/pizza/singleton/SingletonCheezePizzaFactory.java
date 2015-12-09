package com.crust87.pizza.singleton;

import com.crust87.pizza.factorymethod.CheezePizza;

/**
 * Singleton Pattern - Lazy Initialization
 * 
 * Double-checked locking pattern 사용
 * Multi-threaded환경에서 lock 으로인해 발생하는 오버해드를 줄일수있다.
 * 
 * @author mabi
 *
 */
public class SingletonCheezePizzaFactory extends CheezePizza {
	private static volatile SingletonCheezePizzaFactory INSTANCE;
	private SingletonCheezePizzaFactory() {}
	
	public static SingletonCheezePizzaFactory getInstance() {
		if (INSTANCE == null ) {
            synchronized (SingletonCheezePizzaFactory.class) {
                if (INSTANCE == null) {
                	INSTANCE = new SingletonCheezePizzaFactory();
                }
            }
        }

        return INSTANCE;
	}
}
