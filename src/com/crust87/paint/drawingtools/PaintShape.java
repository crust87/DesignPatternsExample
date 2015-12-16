package com.crust87.paint.drawingtools;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

public abstract class PaintShape {
	
	protected Shape shape;
	
	public Shape getShape() { return shape; }
	public void setShape(Shape shape) { this.shape = shape; }
	
	public abstract PaintShape clone();
	public abstract void draw(Graphics2D g2D);	
	public abstract Rectangle getBounds();
	
	public abstract void startDrawing(Point p);
	public abstract void keepDrawing(Point p);
	public abstract void finishDrawing(Point p);
	
	public abstract PaintShape deepCopy();
}