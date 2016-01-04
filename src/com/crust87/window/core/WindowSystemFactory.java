package com.crust87.window.core;

import com.crust87.window.WindowImp;
import com.crust87.window.xwindow.XWindowImp;

public class WindowSystemFactory {
	
	private static final WindowImp instnace = new XWindowImp();

	public WindowSystemFactory() {
	}
	
	public static WindowImp getInstance() {
		return instnace;
	}
}
