package com.crust87.paint.example5;

public class Main {

	// Exampe4의 Prototype Factory의 유일성을 보장하기위해 Singleton Pattern 적용
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
