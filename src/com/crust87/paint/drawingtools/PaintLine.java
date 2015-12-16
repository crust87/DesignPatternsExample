package com.crust87.paint.drawingtools;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

public class PaintLine extends PaintShape {
	
	public PaintLine() {
		super();
		mShape = new Line2D.Double();
	}
	
	@Override
	public PaintShape clone() {
		return new PaintLine();
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
		Line2D.Double line = (Line2D.Double) mShape;
		line.setLine(point, point);
	}

	@Override
	public void keepDrawing(Point point) {
		Line2D.Double line = (Line2D.Double) mShape;
		line.setLine(line.getP1(), point);
	}

	@Override
	public void finishDrawing(Point p) {
	}
}
