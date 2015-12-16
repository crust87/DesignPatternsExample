package com.crust87.paint.example5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import com.crust87.paint.constants.Constants;

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	// components
	private ButtonGroup mButtonGroup;
	private ToolBarActionListener mToolBarActionListener;
	
	// association
	private Panel mPanel;
	
	public ToolBar() {
		
		// components
		mToolBarActionListener = new ToolBarActionListener();
		mButtonGroup = new ButtonGroup();

		for (int i = 0; i < Constants.TOOLBAR_BUTTONNAMES.values().length; i++) {
			JRadioButton button = new JRadioButton();

			button.setIcon(new ImageIcon(Constants.TOOLBAR_BUTTONICON_FOLDER
					+ Constants.TOOLBAR_BUTTONNAMES.values()[i].toString()
					+ Constants.TOOLBAR_BUTTONICON_TYPE));
			button.setSelectedIcon(new ImageIcon(Constants.TOOLBAR_BUTTONICON_FOLDER
					+ Constants.TOOLBAR_BUTTONNAMES.values()[i].toString()
					+ Constants.TOOLBAR_BUTTONICON_SLT
					+ Constants.TOOLBAR_BUTTONICON_TYPE));
			button.addActionListener(mToolBarActionListener);
			button.setActionCommand(Constants.TOOLBAR_BUTTONNAMES.values()[i].toString());
			
			mButtonGroup.add(button);
			this.add(button);
		}
	}
	
	public void init() {
		JRadioButton button = (JRadioButton) this.getComponent(Constants.TOOLBAR_BUTTONNAMES.rectangle.ordinal());
		button.doClick();
	}
	
	public void setPanel(Panel panel) {
		mPanel = panel;
	}
	
	private class ToolBarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton button = (JRadioButton) e.getSource();
			mPanel.setDrawingAction(button.getActionCommand());
		}
	}
}
