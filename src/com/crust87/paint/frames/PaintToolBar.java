package com.crust87.paint.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import com.crust87.paint.constants.Constants;

public class PaintToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	// components
	private ButtonGroup buttonGroup;	
	private GetToolBarHandler getToolBarHandler;
	
	// association
	private PaintPanel myPanel;
	
	public PaintToolBar() {
		
		// components
		getToolBarHandler = new GetToolBarHandler();
		buttonGroup = new ButtonGroup();

		for (int i = 0; i < Constants.TOOLBAR_BUTTONNAMES.values().length; i++) {
			JRadioButton button = new JRadioButton();

			button.setIcon(new ImageIcon(Constants.TOOLBAR_BUTTONICON_FOLDER
					+ Constants.TOOLBAR_BUTTONNAMES.values()[i].toString()
					+ Constants.TOOLBAR_BUTTONICON_TYPE));
			button.setSelectedIcon(new ImageIcon(
					Constants.TOOLBAR_BUTTONICON_FOLDER
					+ Constants.TOOLBAR_BUTTONNAMES.values()[i].toString()
					+ Constants.TOOLBAR_BUTTONICON_SLT
					+ Constants.TOOLBAR_BUTTONICON_TYPE));
			button.addActionListener(getToolBarHandler);
			button.setActionCommand(Constants.TOOLBAR_BUTTONNAMES.values()[i].toString());
			
			buttonGroup.add(button);
			this.add(button);
		}
	}
	
	public void init() {
		JRadioButton rButton = (JRadioButton) this.getComponent(Constants.TOOLBAR_BUTTONNAMES.rectangle.ordinal());
		rButton.doClick();
	}
	
	// getters and setters
	public PaintPanel getMyPanel() { return myPanel;}
	public void setMyPanel(PaintPanel myPanel) { this.myPanel = myPanel; }

	
	private class GetToolBarHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton button = (JRadioButton) e.getSource();
			myPanel.setShape(button.getActionCommand());
		}

	}
}
