package com.crust87.pizza;

import com.crust87.pizza.builder.CheezePizzaBuilder;
import com.crust87.pizza.builder.PizzaBuilder;
import com.crust87.pizza.builder.PlainPizzaBuilder;
import com.crust87.pizza.factory.PizzaFactory;

public class PizzaMain {
	public static void main(String[] args) {
		/*
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = createPizza(new PlainPizzaFactory());
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(new CheezePizzaFactory());
		cheezePizza.cook();
		*/
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = createPizza(new PlainPizzaBuilder());
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(new CheezePizzaBuilder());
		cheezePizza.cook();
	}
	
	public static Pizza createPizza(PizzaBuilder pizzaBuilder) {
		Pizza lPizza = pizzaBuilder.buildPizza()
									.buildDough()
									.buildHam()
									.buildCheeze()
									.buildCheeze()
									.buildCheeze()
									.getPizza();
		
		return lPizza;
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
