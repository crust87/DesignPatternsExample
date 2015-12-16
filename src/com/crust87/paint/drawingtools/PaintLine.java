package com.crust87.paint.drawingtools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

public class PaintLine extends PaintShape {
	
	public PaintLine() {
		super();
		shape = new Line2D.Double();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintLine();
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
		Line2D.Double l = (Line2D.Double)shape;
		l.setLine(p, p);
	}

	@Override
	public void keepDrawing(Point p) {
		Line2D.Double l = (Line2D.Double)shape;
		l.setLine(l.getP1(), p);
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
