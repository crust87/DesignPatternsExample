package com.crust87.pizza.ham;

/**
 * Null Object Pattern
 * 아무일도 하지 않는 객체를 만든다.
 * return null을 피할 수 있고 해당 패턴을 사용할 경우 null check를 하지 않을 수 있다.
 * 
 * @author mabi
 *
 */
public class NullHam extends Ham {

	@Override
	public void cook() {
		// DO NOTHING
	}
}
