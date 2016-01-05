package com.crust87.visualcomponent;

public class TextView extends VisualComponent {

	private String mText;
	
	public TextView(String text) {
		mText = text;
	}

	public TextView() {
		this("");
	}
	
	@Override
	public void draw() {
		System.out.println("draw TextView with " + mText);
	}

	@Override
	public void resize() {
		
	}

}
