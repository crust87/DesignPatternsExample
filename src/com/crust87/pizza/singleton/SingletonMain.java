package com.crust87.pizza.singleton;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.ham.NullHam;

/**
 * 오직 한 개의 클래스 인스턴스만을 갖도록 보장하고, 이에 대한 전역저긴 접근점을 제공
 * 
 * 클래스의 인스턴스가 오직 하나여야 함을 보장하고, 잘 정의된 접근점(access point)으로 모든 사용자가 접근할 수 있도록 해야 할 때
 * 유일한 인스턴스가 서브클래싱으로 확장되어야 하며, 사용자는 코드의 수정없이 확장된 서브클래스의 인스턴스를 사용할 수 있어야 할 때
 * 
 * 유일하게 존재하는 인스턴스로의 접근을 통제합니다.
 * 이름 공간(name space)을 좁힙니다.
 * 연산 및 표현의 정제를 허용합니다.인스턴스의 개수를 변경하기가 자유롭습니다.
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		EnumPepperoniPizza enumPepperoniPizza = EnumPepperoniPizza.INSTANCE;
		SingletonPrototypePizzaFactory singletonPrototypePizzaFactory = SingletonPrototypePizzaFactory.getInstance();
		singletonPrototypePizzaFactory.setPrototype(new PlainDough(), new PlainCheeze(), new NullHam());
		
		System.out.println("Cook pepperoni pizza!");
		Pizza pepperoniPizza = enumPepperoniPizza.createPizza();
		pepperoniPizza.cook();
		
		System.out.println("\nCook cheeze pizza!");
		Pizza cheezePizza = createPizza(singletonPrototypePizzaFactory);
		cheezePizza.cook();
		
		System.out.println("\nCook plain pizza!");
		Pizza plainPizza = SingletonPlainPizza.getInstance();
		plainPizza.cook();
		
		System.out.println("\nCook cheeze pizza2!");
		Pizza cheezePizza2 = SingletonPlainPizza.getInstance();
		cheezePizza2.cook();
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
