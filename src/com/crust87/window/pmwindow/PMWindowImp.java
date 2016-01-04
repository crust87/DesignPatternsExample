package com.crust87.window.pmwindow;

import com.crust87.window.WindowImp;
import com.crust87.window.core.Point;

public class PMWindowImp extends WindowImp {
	
	private HPS mHps;

	public PMWindowImp() {
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
		Point[] points = new Point[4];
		points[0].x = l;
		points[0].y = t;
		
		points[1].x = r;
		points[1].y = t;
		
		points[2].x = r;
		points[2].y = b;
		
		points[3].x = l;
		points[3].y = b;
		
		gpiStrokePath(mHps, points);
	}

	@Override
	public void deviceText(String text, float x, float y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deviceBitmap(String path, float x, float y) {
		// TODO Auto-generated method stub

	}
	
	private void gpiStrokePath(HPS mHps2, Point[] points) {
		// TODO Auto-generated method stub
	}
}
