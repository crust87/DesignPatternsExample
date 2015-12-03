package com.crust87.pizza;

import com.crust87.pizza.factory.CheezePizzaFactory;
import com.crust87.pizza.factory.PizzaFactory;
import com.crust87.pizza.factory.PlainPizzaFactory;

public class FactoryMain {
	public static void main(String[] args) {

		PlainPizzaFactory plainPizzaFactory = new PlainPizzaFactory();
		CheezePizzaFactory cheezePizzaFactory = new CheezePizzaFactory();
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = createPizza(plainPizzaFactory);
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(cheezePizzaFactory);
		cheezePizza.cook();
	}
	
	
	public static Pizza createPizza(PizzaFactory pizzaFactory) {
		Pizza lPizza = pizzaFactory.makePizza();
		lPizza.setDough(pizzaFactory.makeDough());
		lPizza.setHam(pizzaFactory.makeHam());
		lPizza.addCheeze(pizzaFactory.makeCheeze());
		lPizza.addCheeze(pizzaFactory.makeCheeze());
		lPizza.addCheeze(pizzaFactory.makeCheeze());
		
		return lPizza;
	}
}
