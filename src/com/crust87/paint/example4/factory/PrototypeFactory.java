package com.crust87.paint.example4.factory;

import com.crust87.paint.drawingtools.PaintShape;

public class PrototypeFactory extends ShapeFactory {

	private PaintShape mPrototype;
	
	public void setPrototype(PaintShape prototype) {
		mPrototype = prototype;
	}
	
	@Override
	public PaintShape makeShape() {
		return mPrototype.clone();
	}
}
