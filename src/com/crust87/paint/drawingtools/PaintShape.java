package com.crust87.paint.drawingtools;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;

public abstract class PaintShape {
	
	protected Shape mShape;
	
	public Shape getShape() { return mShape; }
	public void setShape(Shape shape) { this.mShape = shape; }
	
	public abstract PaintShape clone();
	public abstract void draw(Graphics2D g2D);	
	public abstract Rectangle getBounds();
	
	public abstract void startDrawing(Point point);
	public abstract void keepDrawing(Point point);
	public abstract void finishDrawing(Point point);
}