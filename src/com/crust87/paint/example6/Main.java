package com.crust87.paint.example6;

public class Main {

	// Example5의 하는일에비해 비대한 Factory Class를 
	// Prototype Pattern을 유지하면서 
	// Abstract Factory Pattern을 제외시키고 
	// Factory Method Pattern으로 재구성
	// Panel.java makeShape()참조
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
