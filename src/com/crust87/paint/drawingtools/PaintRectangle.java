package com.crust87.paint.drawingtools;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class PaintRectangle extends PaintShape {
	
	public PaintRectangle() {
		super();
		mShape = new Rectangle();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintRectangle();
	}
	
	@Override
	public void draw(Graphics2D g2D) {
		g2D.draw(mShape);
	}
	
	@Override
	public Rectangle getBounds() {
		return mShape.getBounds();
	}

	@Override
	public void startDrawing(Point point) {
		Rectangle rectangle = (Rectangle)mShape;
		rectangle.setLocation(point.x, point.y);
	}

	@Override
	public void keepDrawing(Point point) {
		Rectangle rectangle = (Rectangle)mShape;
		rectangle.setSize(point.x - rectangle.x, point.y - rectangle.y);
	}

	@Override
	public void finishDrawing(Point p) {
	}
}
