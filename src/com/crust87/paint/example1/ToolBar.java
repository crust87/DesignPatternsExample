package com.crust87.paint.example1;

import java.util.Collections;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;

import com.crust87.paint.constants.Constants;

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	// components
	private ButtonGroup mButtonGroup;
	private List<AbstractButton> mButtonList;
	
	public ToolBar() {
		
		// components
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
			button.setActionCommand(Constants.TOOLBAR_BUTTONNAMES.values()[i].toString());
			
			mButtonGroup.add(button);
			this.add(button);
		}
		
		mButtonList = Collections.list(mButtonGroup.getElements());
	}
	
	public String getCurrentButton() {
		
		for(AbstractButton button: mButtonList) {
			JRadioButton radioButton = (JRadioButton) button;
			if(radioButton.isSelected()) {
				return radioButton.getActionCommand();
			}
		}
		
		return null;
	}
	
	public void init() {
		JRadioButton button = (JRadioButton) this.getComponent(Constants.TOOLBAR_BUTTONNAMES.rectangle.ordinal());
		button.doClick();
	}
}
