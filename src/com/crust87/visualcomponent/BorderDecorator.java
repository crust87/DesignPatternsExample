package com.crust87.visualcomponent;

public class BorderDecorator extends Decorator {

	private int mBorderWidth;
	
	public BorderDecorator(VisualComponent component, int borderWidth) {
		super(component);
		
		mBorderWidth = borderWidth;
	}
	
	public BorderDecorator(VisualComponent component) {
		this(component, 1);
	}

	private void drawBorder() {
		System.out.println("draw BorderDecorator with " + mBorderWidth + "px");
	}

	@Override
	public void draw() {
		super.draw();
		drawBorder();
	}
	
}
