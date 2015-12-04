package com.crust87.pizza.singleton;

public class SpecialHolderPizza {
	
	private SpecialHolderPizza() {
		
	}
	
	private static class SpecialPizzaHolder {
		private static final SpecialHolderPizza INSTANCE = new SpecialHolderPizza();
	}
	
	public static SpecialHolderPizza getInstance() {
		return SpecialPizzaHolder.INSTANCE;
	}
}
