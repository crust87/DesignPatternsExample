package com.crust87.paint2.shapes;

import com.crust87.paint2.othersystem.Text;

public class TextBox extends Shape {

	private Text mText;
	
	public TextBox() {
		mText = new Text();
	}
	
	@Override
	public void draw() {
		mText.printText();
	}

}
