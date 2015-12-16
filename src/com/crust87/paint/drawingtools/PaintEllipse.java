package com.crust87.paint.drawingtools;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class PaintEllipse extends PaintShape {
	
	public PaintEllipse() {
		super();
		mShape = new Ellipse2D.Double();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintEllipse();
	}
	
	@Override
	public void draw(Graphics2D g2D) {
		Color tempColor;
		tempColor = g2D.getColor();
		g2D.draw(mShape);
		g2D.setColor(tempColor);
	}
	
	@Override
	public Rectangle getBounds() {
		return mShape.getBounds();
	}

	@Override
	public void startDrawing(Point point) {
		Ellipse2D.Double ellipse = (Ellipse2D.Double) mShape;
		ellipse.setFrame(point.x, point.y, 0, 0);
	}

	@Override
	public void keepDrawing(Point point) {
		Ellipse2D.Double ellipse = (Ellipse2D.Double) mShape;
		ellipse.setFrame(ellipse.x, ellipse.y, point.x - ellipse.x, point.y - ellipse.y);
	}

	@Override
	public void finishDrawing(Point p) {
	}
}
