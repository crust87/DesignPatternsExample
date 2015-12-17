package com.crust87.paint.example5;

public class Main {

	// Exampe4의 프로토타입의 유일성을 보장하기위해 Singleton으로 변경
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
