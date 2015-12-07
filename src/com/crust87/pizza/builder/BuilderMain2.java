package com.crust87.pizza.builder;

/**
 * Builder Pattern 예제2
 * Constructor의 너무 많은 Parameter에 대응하기위한 Builder Pattern 변형 
 * 
 * @author mabi
 *
 */
public class BuilderMain2 {
	
	public static void main(String[] args) {
		BigPizza.Builder bigPizzaBuilder = new BigPizza.Builder().setCheeze1(99f).setDough1(-20).setHam3(777).setReuse(true);
		BigPizza bigPizza0 = bigPizzaBuilder.build();
		BigPizza bigPizza1 = bigPizzaBuilder.build();
		
		System.out.println("big pizza0");
		System.out.println(bigPizza0);
		System.out.println("\nbig pizza1");
		System.out.println(bigPizza1);
	}
}
