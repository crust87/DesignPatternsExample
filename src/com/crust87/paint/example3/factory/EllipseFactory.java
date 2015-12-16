package com.crust87.paint.example3.factory;

import com.crust87.paint.drawingtools.PaintEllipse;
import com.crust87.paint.drawingtools.PaintShape;

public class EllipseFactory extends ShapeFactory {

	@Override
	public PaintShape makeShape() {
		return new PaintEllipse();
	}
}
