package com.crust87.paint.constants;

import java.awt.Color;

public class Constants {	
	
	// 툴바 버튼
	public static enum TOOLBAR_BUTTONNAMES {
		rectangle,
		ellipse,
		line
	};
	
	// 버튼 그리기를 위한 스트링
	public final static String TOOLBAR_BUTTONICON_FOLDER = "icon/";
	public final static String TOOLBAR_BUTTONICON_TYPE = ".PNG";
	public final static String TOOLBAR_BUTTONICON_SLT = "SLT";
	
	public static enum DRAWING_STATE{
		tpDrawing,
		idle,
	};
	
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	
}
