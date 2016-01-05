package com.crust87.visualcomponent;

public class Decorator extends VisualComponent {

	private VisualComponent mComponent;
	
	public Decorator(VisualComponent component) {
		mComponent = component;
	}

	@Override
	public void draw() {
		mComponent.draw();
	}

	@Override
	public void resize() {
		mComponent.resize();
	}

}
