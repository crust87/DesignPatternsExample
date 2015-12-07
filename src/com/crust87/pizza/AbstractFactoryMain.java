package com.crust87.pizza;

import com.crust87.pizza.abstractfactory.CheezePizzaFactory;
import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.abstractfactory.PlainPizzaFactory;

/**
 * Abstract Factory Pattern 예제
 * 
 * @author mabi
 *
 */
public class AbstractFactoryMain {
	
	public static void main(String[] args) {

		// Abstract Factory 생성
		PlainPizzaFactory plainPizzaFactory = new PlainPizzaFactory();
		CheezePizzaFactory cheezePizzaFactory = new CheezePizzaFactory();
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = createPizza(plainPizzaFactory);
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(cheezePizzaFactory);
		cheezePizza.cook();
	}
	
	// Abstract Factory를 통해 피자를 생성하는 메소드
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
