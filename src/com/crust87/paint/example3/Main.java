package com.crust87.paint.example3;

public class Main {

	// Example2의 구조를 개선
	// Abstract Factory Pattern을 사용하여 setDrawingAction() 타이밍에  그려야할 Shape를 결정
	// startDrawing()이 단순화됨
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
