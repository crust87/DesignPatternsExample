package com.crust87.pizza.singleton;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.NullHam;

public class SingletonMain {

	public static void main(String[] args) {
		EnumPepperoniPizza enumPepperoniPizzaBox = EnumPepperoniPizza.getInstance();
		SingletonPrototypePizzaFactory singletonPrototypePizzaFactory = SingletonPrototypePizzaFactory.getInstance();
		singletonPrototypePizzaFactory.setPrototype(new PlainDough(), new PlainCheeze(), new NullHam());
		
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = enumPepperoniPizzaBox.createPizza();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(singletonPrototypePizzaFactory);
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
