package com.crust87.paint.example2;

public class Main {

	// Example1의 구조를 개선
	// ToolBar가 Panel을 참조하는 구조로 변경
	// ToolBar는 ActionListener를 통해 선택된 도형이 어떤것인지 Panel에게 전달한다.
	// Panel.java setDrawingAction() 참조
	// 여전히 그리기를 시작할때마다 Shape를 결정
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.init();
		frame.setVisible(true);
	}
}
