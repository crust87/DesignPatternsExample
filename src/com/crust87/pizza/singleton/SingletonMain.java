package com.crust87.pizza.singleton;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.abstractfactory.PizzaFactory;

public class SingletonMain {

	public static void main(String[] args) {
		EnumPepperoniPizzaBox enumPepperoniPizzaBox = EnumPepperoniPizzaBox.getInstance();
		SingletonCheezePizzaFactory singletonCheezePizzaFactory = SingletonCheezePizzaFactory.getInstance();
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = enumPepperoniPizzaBox.createPizza();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(singletonCheezePizzaFactory);
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
