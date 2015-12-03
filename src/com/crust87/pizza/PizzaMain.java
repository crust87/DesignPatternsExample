package com.crust87.pizza;

import com.crust87.pizza.builder.CheezePizzaBuilder;
import com.crust87.pizza.builder.PepperoniPizzaBuilder;
import com.crust87.pizza.builder.PizzaBuilder;
import com.crust87.pizza.factory.CheezePizzaFactory;
import com.crust87.pizza.factory.PizzaFactory;
import com.crust87.pizza.factory.PlainPizzaFactory;

public class PizzaMain {
	public static void main(String[] args) {

		PlainPizzaFactory plainPizzaFactory = new PlainPizzaFactory();
		CheezePizzaFactory cheezePizzaFactory = new CheezePizzaFactory();
		
//		System.out.println("Cook plain pizza!");
//		Pizza plainPizza = createPizza(plainPizzaFactory);
//		plainPizza.cook();
//		
//		System.out.println("\nCook cheeze pizza!");
//		Pizza cheezePizza = createPizza(cheezePizzaFactory);
//		cheezePizza.cook();

		PepperoniPizzaBuilder plainPizzaBuilder = new PepperoniPizzaBuilder();
		CheezePizzaBuilder cheezePizzaBuilder = new CheezePizzaBuilder();
		
//		System.out.println("Cook pepperoni pizza!");
//		Pizza plainPizza = createPizza(plainPizzaBuilder);
//		plainPizza.cook();
//		
//		System.out.println("\nCook cheeze pizza!");
//		Pizza cheezePizza = createPizza(cheezePizzaBuilder);
//		cheezePizza.cook();
		
		BigPizza.Builder bigPizzaBuilder = new BigPizza.Builder().setCheeze1(99f).setDough1(-20).setHam3(777);
		BigPizza bigPizza0 = bigPizzaBuilder.build();
		BigPizza bigPizza1 = bigPizzaBuilder.build();
		
		System.out.println("big pizza0");
		System.out.println(bigPizza0);
		System.out.println("\nbig pizza1");
		System.out.println(bigPizza1);
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
