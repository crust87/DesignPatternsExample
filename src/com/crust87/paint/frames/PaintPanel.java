package com.crust87.paint.frames;
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

public class PaintPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// attributes
	private DRAWING_STATE drawingState;
	
	// component
	private ArrayList<PaintShape> shapes;
	private MouseEventHandler mouseEventHandler;
	
	// prototypes
	private PaintRectangle mPrototypeRectangle;
	private PaintEllipse mPaintEllipse;
	private PaintLine mPaintLine;
	
	// working variables
	private PaintShape shapeTool;
	
	// constructors
	public PaintPanel() {
		// attribute
		drawingState = DRAWING_STATE.idle;
		
		// components
		shapes = new ArrayList<PaintShape>();
		
		mouseEventHandler = new MouseEventHandler();
		addMouseListener(mouseEventHandler);
		addMouseMotionListener(mouseEventHandler);
		
		setBackground(Color.WHITE);
		
		mPrototypeRectangle = new PaintRectangle();
		mPaintEllipse = new PaintEllipse();
		mPaintLine = new PaintLine();
	}
	
	public void init() {
	}
	
	public ArrayList<PaintShape> getShapes() { return shapes; }
	public void setShapes(ArrayList<PaintShape> shapes) {
		if(shapes == null) {
			this.shapes.clear();
		} else {
			this.shapes = shapes;
		}
		
		repaint();
	}

	public PaintShape getShape() { return shapeTool; }
	public void setShape(PaintShape shape) { this.shapeTool = shape; }
	
	public void setShape(String actionCommand) {
		if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.rectangle.toString())) {
			setShape(mPrototypeRectangle);
		} else if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.ellipse.toString())) {
			setShape(mPaintEllipse);
		} else if(actionCommand.equals(Constants.TOOLBAR_BUTTONNAMES.line.toString())) {
			setShape(mPaintLine);
		}
	}

	public void startDrawing(Point startP) {
		Graphics2D g2D = (Graphics2D) getGraphics();
		shapeTool = shapeTool.clone();
		shapeTool.startDrawing(startP);
		shapeTool.draw(g2D);
	}

	public void keepDrawing(Point currentP) {
		Graphics2D g2D = (Graphics2D) getGraphics();
		g2D.setXORMode(getBackground());
		float[] dashes = { 4 };
		g2D.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, dashes, 1));
		shapeTool.draw(g2D);
		shapeTool.keepDrawing(currentP);
		shapeTool.draw(g2D);
	}
	
	public void finishDrawing(Point p) {
		if(!(shapeTool.getBounds().width == 0 && shapeTool.getBounds().height == 0)) {
			shapes.add(shapeTool);
				
			Graphics2D g2D = (Graphics2D) getGraphics();
			shapeTool.draw(g2D);
			repaint();
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		for(PaintShape s : shapes) {
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
			if(drawingState == DRAWING_STATE.idle) {
				startDrawing(point);
				drawingState = DRAWING_STATE.tpDrawing;
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point point = e.getPoint();
			if(drawingState == DRAWING_STATE.tpDrawing) {
				keepDrawing(point);	
			}
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			Point point = e.getPoint();
			if(drawingState == DRAWING_STATE.tpDrawing) {
				finishDrawing(point);
				drawingState = DRAWING_STATE.idle;
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
	
	
	
	