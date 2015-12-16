package com.crust87.paint.frames;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PaintFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	// components
	private PaintToolBar mToolBar;
	private PaintPanel mPanel;
	
	public PaintFrame() {
		// attributes
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// components		
		mToolBar = new PaintToolBar();
		this.add(BorderLayout.NORTH, mToolBar);
		mToolBar.setSize(400,16);
		
		mPanel = new PaintPanel();
		this.add(mPanel);
	}

	public void init() {
		// associations
		mToolBar.setMyPanel(mPanel);
		
		// component initialize
		mToolBar.init();
		mPanel.init();
		
	}
}