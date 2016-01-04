package com.crust87.window;

public class WindowSystemFactory {
	
	private static final WindowImp instnace = new XWindowImp();

	public WindowSystemFactory() {
	}
	
	public static WindowImp getInstance() {
		return instnace;
	}
}
