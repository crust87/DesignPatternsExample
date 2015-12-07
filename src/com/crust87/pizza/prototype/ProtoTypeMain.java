package com.crust87.pizza.prototype;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.dough.ThinDough;
import com.crust87.pizza.ham.Pepperoni;
import com.crust87.pizza.ham.PlainHam;

public class ProtoTypeMain {

	public static void main(String[] args) {
		
		// ProtoType Factory 생성
		ProtoTypePizzaFactory plainPizzaFactory = new ProtoTypePizzaFactory(new PlainDough(), new PlainCheeze(), new PlainHam());
		ProtoTypePizzaFactory cheezePizzaFactory = new ProtoTypePizzaFactory(new ThinDough(), new PlainCheeze(), new Pepperoni());
				
		System.out.println("Cook plain pizza!");
		Pizza plainPizza = createPizza(plainPizzaFactory);
		plainPizza.cook();
				
		System.out.println("\nCook pepperoni pizza!");
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
