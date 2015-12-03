package com.crust87.pizza;

import java.util.ArrayList;

import com.crust87.pizza.cheeze.Cheeze;
import com.crust87.pizza.dough.Dough;
import com.crust87.pizza.ham.Ham;

public class Pizza {
	private Dough mDough;
	private Ham mHam;
	private ArrayList<Cheeze> mCheezes;
	
	public Pizza() {
		mCheezes = new ArrayList<Cheeze>();
	}
	
	public void cook() {
		mDough.cook();
		mHam.cook();
		for(Cheeze c: mCheezes) {
			c.cook();
		}
	}

	public Ham getHam() {
		return mHam;
	}
	
	public void setHam(Ham ham) {
		mHam = ham;
	}
	
	public Dough getDough() {
		return mDough;
	}
	
	public void setDough(Dough dough) {
		mDough = dough;
	}
	
	public ArrayList<Cheeze> getCheezes() {
		return mCheezes;
	}
	
	public void addCheeze(Cheeze cheeze) {
		mCheezes.add(cheeze);
	}
}
