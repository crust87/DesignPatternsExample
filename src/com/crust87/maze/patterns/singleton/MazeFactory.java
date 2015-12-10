package com.crust87.maze.patterns.singleton;

public class MazeFactory {

	private static MazeFactory INSTANCE;
	
	protected MazeFactory() {
	}
	
	public static MazeFactory getInstance() {
		if(INSTANCE == null) {
			synchronized (MazeFactory.class) {
				if(INSTANCE == null) {
					INSTANCE = new MazeFactory();
				}
			}
		}
		return INSTANCE;
	}
}
