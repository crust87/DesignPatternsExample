package com.crust87.paint.example6;

public class Main {

	// Example5의 Factory Class가 하는일이 너무 없어서 Prototype Pattern을 유지하면서 Abstract Factory Pattern을 제외시키고 Factory Method Pattern으로 재구성
	// Panel.java makeShape()참조
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
