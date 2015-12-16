package com.crust87.paint.frames;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PaintFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	// components
	private PaintToolBar toolBar;
	private PaintPanel panel;
	
	public PaintFrame() {
		// attributes
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// components		
		toolBar = new PaintToolBar();
		this.add(BorderLayout.NORTH, toolBar);
		toolBar.setSize(400,16);
		
		panel = new PaintPanel();
		this.add(panel);
	}

	public void init() {
		// associations
		toolBar.setMyPanel(panel);
		
		// component initialize
		toolBar.init();
		panel.init();
		
	}
}