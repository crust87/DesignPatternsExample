package com.crust87.paint.example5.factory;

import com.crust87.paint.drawingtools.PaintShape;

public class PrototypeFactory extends ShapeFactory {

	private PaintShape mPrototype;
	
	private PrototypeFactory() {
		super();
	}
	
	private static class PrototypeFactoryHolder {
		private static PrototypeFactory INSTANCE = new PrototypeFactory();
	}
	
	public static ShapeFactory getInstance() {
		return PrototypeFactoryHolder.INSTANCE;
	}
	
	public void setPrototype(PaintShape prototype) {
		mPrototype = prototype;
	}
	
	@Override
	public PaintShape makeShape() {
		return mPrototype.clone();
	}
}
