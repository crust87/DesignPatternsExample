package com.crust87.computer;

public class Card extends Equipment {

	public Card(String name) {
		super(name);
	}

	@Override
	public int power() {
		return 1;
	}

	@Override
	public int netPrice() {
		return 10;
	}

	@Override
	public int DiscountPrice() {
		return 9;
	}

	@Override
	public void add(Equipment equipment) {
	}

	@Override
	public void remove(Equipment equipment) {
	}

}
