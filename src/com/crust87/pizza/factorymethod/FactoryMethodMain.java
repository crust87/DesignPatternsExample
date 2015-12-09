package com.crust87.pizza.factorymethod;

import com.crust87.pizza.Pizza;

public class FactoryMethodMain {

	public static void main(String[] args) {
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = new PlainPizza();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = new CheezePizza();
		cheezePizza.cook();
	}
}
