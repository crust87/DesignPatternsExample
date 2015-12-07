package com.crust87.pizza;

import com.crust87.pizza.factorymethod.CheezePizzaBox;
import com.crust87.pizza.factorymethod.PlainPizzaBox;

public class FactoryMethodMain {

	public static void main(String[] args) {
		PlainPizzaBox plainPizzaBox = new PlainPizzaBox();
		CheezePizzaBox cheezePizzaBox = new CheezePizzaBox();
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = plainPizzaBox.createPizza();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = cheezePizzaBox.createPizza();
		cheezePizza.cook();
	}
}
