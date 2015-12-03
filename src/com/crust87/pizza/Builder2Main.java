package com.crust87.pizza;

public class Builder2Main {
	public static void main(String[] args) {
		BigPizza.Builder bigPizzaBuilder = new BigPizza.Builder().setCheeze1(99f).setDough1(-20).setHam3(777);
		BigPizza bigPizza0 = bigPizzaBuilder.build();
		BigPizza bigPizza1 = bigPizzaBuilder.build();
		
		System.out.println("big pizza0");
		System.out.println(bigPizza0);
		System.out.println("\nbig pizza1");
		System.out.println(bigPizza1);
	}
}
