package com.crust87.paint.drawingtools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class PaintRectangle extends PaintShape {
	
	public PaintRectangle() {
		super();
		shape = new Rectangle();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintRectangle();
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
		Rectangle r = (Rectangle)shape;
		r.setLocation(p.x, p.y);
	}

	@Override
	public void keepDrawing(Point p) {
		Rectangle r = (Rectangle)shape;
		r.setSize(p.x - r.x, p.y - r.y);
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
