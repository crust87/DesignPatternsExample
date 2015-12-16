package com.crust87.paint.example3.factory;

import com.crust87.paint.drawingtools.PaintRectangle;
import com.crust87.paint.drawingtools.PaintShape;

public class RectangleFactory extends ShapeFactory {

	@Override
	public PaintShape makeShape() {
		return new PaintRectangle();
	}
}
