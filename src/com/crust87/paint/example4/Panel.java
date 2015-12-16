package com.crust87.paint.example4;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.crust87.paint.constants.Constants;
import com.crust87.paint.constants.Constants.DRAWING_STATE;
import com.crust87.paint.drawingtools.PaintEllipse;
import com.crust87.paint.drawingtools.PaintLine;
import com.crust87.paint.drawingtools.PaintRectangle;
import com.crust87.paint.drawingtools.PaintShape;
import com.crust87.paint.example3.factory.ShapeFactory;
import com.crust87.paint.example4.factory.PrototypeFactory;

public class Panel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// attributes
	private DRAWING_STATE mDrawingState;
	
	// component
	private ArrayList<PaintShape> mShapes;
	private MouseEventHandler mouseEventHandler;
	
	// factory
	private PrototypeFactory mPrototypeFactory;
	private PaintRectangle mPrototypeRectangle;
	private PaintEllipse mPrototypeEllipse;
	private PaintLine mPrototypeLine;
	
	// working variables
	private PaintShape mCurrentShape;
	
	// constructors
	public Panel() {
		// attribute
		mDrawingState = DRAWING_STATE.idle;
		
		// components
		mShapes = new ArrayList<PaintShape>();
		
		mouseEventHandler = new MouseEventHandler();
		addMouseListener(mouseEventHandler);
		addMouseMotionListener(mouseEventHandler);
		
		mPrototypeFactory = new PrototypeFactory();
		mPrototypeRectangle = new PaintRectangle();
		mPrototypeEllipse = new PaintEllipse();
		mPrototypeLine = new PaintLine();
		
		setBackground(Color.WHITE);
	}
	
	public void init() {
	}
	
	// Getters and Setters
	public ArrayList<PaintShape> getShapes() {
		return mShapes;
	}
	
	public void setShapes(ArrayList<PaintShape> shapes) {
		if(shapes == null) {
			mShapes.clear();
		} else {
			mShapes = shapes;
		}
		
		repaint();
	}
	
	public void setDrawingAction(String actionCommand) {
		if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.rectangle.toString())) {
			mPrototypeFactory.setPrototype(mPrototypeRectangle);
		} else if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.ellipse.toString())) {
			mPrototypeFactory.setPrototype(mPrototypeEllipse);
		} else if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.line.toString())) {
			mPrototypeFactory.setPrototype(mPrototypeLine);
		}
	}

	public void startDrawing(Point startP) {
		mCurrentShape = mPrototypeFactory.makeShape();
		Graphics2D g2D = (Graphics2D) getGraphics();
		mCurrentShape.startDrawing(startP);
		mCurrentShape.draw(g2D);
	}

	public void keepDrawing(Point currentPoint) {
		Graphics2D g2D = (Graphics2D) getGraphics();
		g2D.setXORMode(getBackground());
		float[] dashes = { 4 };
		g2D.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, dashes, 1));
		mCurrentShape.draw(g2D);
		mCurrentShape.keepDrawing(currentPoint);
		mCurrentShape.draw(g2D);
	}
	
	public void finishDrawing(Point p) {
		if(!(mCurrentShape.getBounds().width == 0 && mCurrentShape.getBounds().height == 0)) {
			mShapes.add(mCurrentShape);
				
			Graphics2D g2D = (Graphics2D) getGraphics();
			mCurrentShape.draw(g2D);
			repaint();
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		for(PaintShape s : mShapes) {
			s.draw(g2D);
		}
	}
	
	private class MouseEventHandler implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
		}		
		
		@Override
		public void mousePressed(MouseEvent e) {
			Point point = e.getPoint();
			if(mDrawingState == DRAWING_STATE.idle) {
				startDrawing(point);
				mDrawingState = DRAWING_STATE.drawing;
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = e.getPoint();
			if(mDrawingState == DRAWING_STATE.drawing) {
				keepDrawing(point);	
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			Point point = e.getPoint();
			if(mDrawingState == DRAWING_STATE.drawing) {
				finishDrawing(point);
				mDrawingState = DRAWING_STATE.idle;
			}
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
		}
	}

}
	
	
	
	