package com.crust87.visualcomponent;

public class ScrollDecorator extends Decorator {
	
	public static final int LEFT = 0;
	public static final int RIGHT = 1;

	private int mScrollSide;
	
	public ScrollDecorator(VisualComponent component, int scrollSide) {
		super(component);
		
		mScrollSide = scrollSide;
	}
	
	public ScrollDecorator(VisualComponent component) {
		this(component, 1);
	}

	private void drawScroll() {
		System.out.println("draw ScrollDecorator with " + mScrollSide);
	}

	@Override
	public void draw() {
		super.draw();
		drawScroll();
	}
	
}
