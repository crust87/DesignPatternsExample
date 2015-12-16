package com.crust87.paint.example5;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	// components
	private ToolBar mToolBar;
	private Panel mPanel;
	
	public Frame() {
		// attributes
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Example5");
		
		// components		
		mToolBar = new ToolBar();
		this.add(BorderLayout.NORTH, mToolBar);
		mToolBar.setSize(400,16);
		
		mPanel = new Panel();
		this.add(mPanel);
	}

	public void init() {
		// associations
		mToolBar.setPanel(mPanel);
		
		// component initialize
		mToolBar.init();
		mPanel.init();
		
	}
}