package com.crust87.pizza.prototype;

import com.crust87.pizza.Pizza;
import com.crust87.pizza.abstractfactory.PizzaFactory;
import com.crust87.pizza.cheeze.PlainCheeze;
import com.crust87.pizza.dough.PlainDough;
import com.crust87.pizza.dough.ThinDough;
import com.crust87.pizza.ham.Pepperoni;
import com.crust87.pizza.ham.PlainHam;

/**
 * Prototype Pattern
 * 
 * GoF의 디자인 패턴
 * 
 * 원형이 되는(prototypical) 인스턴스를 사용하여 생성할 객체의 종류를 명시하고 이렇게 만든 견본을 복사해서 새로운 객체를 생성<br /><br />
 * 
 * 인스턴스화할 클래스를 런타임에 지정할 때<br />
 * 제품 클래스 계통과 병렬적으로 만드는 팩토리 클래스를 피하고 싶을 때<br />
 * 클래스의 인스턴스들이 서로 다른 상태 조합 중에 어느 하나일 때<br /><br />
 * 
 * 런타임에 새로운 제품을 추가하고 삭제할 수 있습니다.<br />
 * 값들을 다양화함으로써 새로운 객체를 명세합니다.<br />
 * 구조를 다양화함으로써 새로운 객체를 명세할 수 있습니다.<br />
 * 서브클래스의 수를 줄입니다.<br />
 * 동적으로 클래스에 따라 응용프로그램을 설정할 수 있습니다.<br />
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {
		
		// ProtoType Factory 생성
		PrototypePizzaFactory plainPizzaFactory = new PrototypePizzaFactory(new PlainDough(), new PlainCheeze(), new PlainHam());
		PrototypePizzaFactory cheezePizzaFactory = new PrototypePizzaFactory(new ThinDough(), new PlainCheeze(), new Pepperoni());
				
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
