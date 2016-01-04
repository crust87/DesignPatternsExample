package com.crust87.window;

public abstract class Window {

	private WindowImp mImp;
	private View mContents;
	
	public Window(View contents) {
		mContents = contents;
	}
	
	protected WindowImp getWindowImp() {
		if(mImp == null) {
			mImp = WindowSystemFactory.getInstance();
		}
		
		return mImp;
	}
	
	protected View getView() {
		return mContents;
	}
	
	public abstract void drawContents();
	
	public abstract void open();
	public abstract void close();
	public abstract void iconify();
	public abstract void deiconify();
	
	public abstract void setOrigin(Point at);
	public abstract void setExtent(Point extent);
	public abstract void raise();
	public abstract void lower();
	
	public abstract void drawLine(Point p1, Point p2);
	public abstract void drawRect(Point p1, Point p2);
	public abstract void drawPoligon(Point[] points, int n);
	public abstract void drawText(String text, Point at);
	
}
