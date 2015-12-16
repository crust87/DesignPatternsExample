package com.crust87.paint.drawingtools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

public class PaintEllipse extends PaintShape {
	
	public PaintEllipse() {
		super();
		shape = new Ellipse2D.Double();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintEllipse();
	}
	
	@Override
	public void draw(Graphics2D g2D) {
		Color tempColor;
		tempColor = g2D.getColor();
		g2D.draw(shape);
		g2D.setColor(tempColor);
	}
	
	@Override
	public Rectangle getBounds() {
		return shape.getBounds();
	}

	@Override
	public void startDrawing(Point p) {
		Ellipse2D.Double e = (Ellipse2D.Double)shape;
		e.setFrame(p.x, p.y, 0, 0);
	}

	@Override
	public void keepDrawing(Point p) {
		Ellipse2D.Double e = (Ellipse2D.Double)shape;
		e.setFrame(e.x, e.y, p.x - e.x, p.y - e.y);
	}

	@Override
	public void finishDrawing(Point p) {
	}
	
	@Override
	public PaintShape deepCopy() {
		AffineTransform affineTransform = new AffineTransform();
		Shape newShape = affineTransform.createTransformedShape(shape);
		PaintRectangle tempShape = new PaintRectangle();
		tempShape.setShape(newShape);
		return tempShape;
	}
	
}
