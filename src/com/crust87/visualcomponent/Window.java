package com.crust87.visualcomponent;

public class Window {

	public static void main(String[] args) {
		VisualComponent textView = new BorderDecorator(new ScrollDecorator(new TextView("Text"), ScrollDecorator.RIGHT), 2);
		textView.draw();
	}

}
