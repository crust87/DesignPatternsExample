package com.crust87.paint.example4;

public class Main {

	// Example3의 비대해진 클래스 구조를 개선
	// Prototype Pattern을 사용하여 Class 수를 줄임
	// 이에따라 Panel.java에 Prototype Object를 Member로 선언
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
