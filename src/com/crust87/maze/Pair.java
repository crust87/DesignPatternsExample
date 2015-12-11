package com.crust87.maze;

public class Pair<F, S> {

	private F first;
	private S second;
	
	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}
	
	public F getFirst() {
		return first;
	}

	public void setFirst(F first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}
	
	@Override
	public boolean equals(Object obj) {
		final Pair<F, S> other = (Pair<F, S>) obj;
		return this.first.equals(other.first) && this.second.equals(other.second);
	}

	@Override
	public int hashCode() {
		return ("first" + first + ":second" + second).hashCode();
	}

	public static<F, S> Pair<F, S> create(F first, S second) {
		return new Pair<F, S>(first, second);
	}
}
