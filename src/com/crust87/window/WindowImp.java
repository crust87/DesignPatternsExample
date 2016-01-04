package com.crust87.window;

import com.crust87.window.core.Point;

public abstract class WindowImp {

	protected WindowImp() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void impTop();
	public abstract void impBottom();
	public abstract void impSetExtent(Point extents);
	public abstract void impSetOrigin(Point origin);
	public abstract void deviceRect(float t, float l, float b, float r);
	public abstract void deviceText(String text, float x, float y);
	public abstract void deviceBitmap(String path, float x, float y);
}
