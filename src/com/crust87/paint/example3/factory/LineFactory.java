package com.crust87.paint.example3.factory;

import com.crust87.paint.drawingtools.PaintLine;
import com.crust87.paint.drawingtools.PaintShape;

public class LineFactory extends ShapeFactory {

	@Override
	public PaintShape makeShape() {
		return new PaintLine();
	}
}
