package com.crust87.paint2;

import java.util.ArrayList;

import com.crust87.paint2.shapes.Line;
import com.crust87.paint2.shapes.Rectangle;
import com.crust87.paint2.shapes.Shape;
import com.crust87.paint2.shapes.TextBox;

public class PaintPanel {

	private ArrayList<Shape> mShapes;
	
	public PaintPanel() {
		mShapes = new ArrayList<>();
	}
	
	public void add(Shape shape) {
		mShapes.add(shape);
	}
	
	public void draw() {
		for(Shape s: mShapes) {
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		PaintPanel paintPanel = new PaintPanel();
		paintPanel.add(new Rectangle());
		paintPanel.add(new Rectangle());
		paintPanel.add(new TextBox());
		paintPanel.add(new TextBox());
		paintPanel.add(new Line());
		paintPanel.add(new Line());
		paintPanel.add(new Line());
		
		paintPanel.draw();
	}
}
