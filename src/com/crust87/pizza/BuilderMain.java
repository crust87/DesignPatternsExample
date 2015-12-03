package com.crust87.pizza;

import com.crust87.pizza.builder.CheezePizzaBuilder;
import com.crust87.pizza.builder.PepperoniPizzaBuilder;
import com.crust87.pizza.builder.PizzaBuilder;

/**
 * Builder Pattern 예제
 * 
 * @author mabi
 *
 */
public class BuilderMain {
	
	public static void main(String[] args) {

		// Builder 생성
		PepperoniPizzaBuilder plainPizzaBuilder = new PepperoniPizzaBuilder();
		CheezePizzaBuilder cheezePizzaBuilder = new CheezePizzaBuilder();
		
		System.out.println("Cook pepperoni pizza!");
		Pizza plainPizza = createPizza(plainPizzaBuilder);
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(cheezePizzaBuilder);
		cheezePizza.cook();
	}
	
	// Builder를 통해 피자를 생성하는 메소드
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
}
