package com.crust87.window.xwindow;

import com.crust87.window.WindowImp;
import com.crust87.window.core.Point;

public class XWindowImp extends WindowImp {

	private Display mDisplay;
	private Drawable mWindowId;
	private GraphicContext mGraphicContext;
	
	public XWindowImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void impTop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void impBottom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void impSetExtent(Point extents) {
		// TODO Auto-generated method stub

	}

	@Override
	public void impSetOrigin(Point origin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deviceRect(float t, float l, float b, float r) {
		int x = Math.round(t);
		int y = Math.round(l);
		int w = Math.round(r - l);
		int h = Math.round(b - t);
		XDrawRectangle(mDisplay, mWindowId, mGraphicContext, x, y, w, h);
	}

	@Override
	public void deviceText(String text, float x, float y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deviceBitmap(String path, float x, float y) {
		// TODO Auto-generated method stub

	}
	
	private void XDrawRectangle(Display mDisplay2, Drawable mWindowId2, GraphicContext mGraphicContext2, int x, int y, int w, int h) {
		
	}

}
