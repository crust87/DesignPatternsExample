package com.crust87.pizza.singleton;

public enum SpecialEnumPizza {
	INSTANCE;
	
	private SpecialEnumPizza() {
		
	}
	
	public static SpecialEnumPizza getInstance() {
		return SpecialEnumPizza.INSTANCE;
	}
}
