package com.crust87.pizza.factorymethod;

import com.crust87.pizza.Pizza;

public class FactoryMethodMain {

	public static void main(String[] args) {
		PlainPizza plainPizzaBox = new PlainPizza();
		CheezePizza cheezePizzaBox = new CheezePizza();
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = plainPizzaBox.createPizza();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = cheezePizzaBox.createPizza();
		cheezePizza.cook();
	}
}
