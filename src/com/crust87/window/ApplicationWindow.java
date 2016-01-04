package com.crust87.window;

public class ApplicationWindow extends Window {

	public ApplicationWindow(View contents) {
		super(contents);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawContents() {
		getView().drawOn(this);
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iconify() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deiconify() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOrigin(Point at) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setExtent(Point extent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void raise() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lower() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawLine(Point p1, Point p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawRect(Point p1, Point p2) {
		WindowImp imp = getWindowImp();
		imp.deviceRect(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	@Override
	public void drawPoligon(Point[] points, int n) {
		// TODO Auto-generated method stub

	}

	@Override
	public void drawText(String text, Point at) {
		// TODO Auto-generated method stub

	}

}
