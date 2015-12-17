package com.crust87.paint.example1;

public class Main {

	// 좋지 못한 케이스에대한 예제
	// 그리기를 시작할때마다 toolBar에 자신이 그려야할 Shape를 결정
	// Panel.java startDrawing() 참조
	// Panel이 ToolBar를 참조하는 구조
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
