package com.crust87.pizza;

public class BigPizza {
	private int dough1;
	private int dough2;
	private double ham1;
	private double ham2;
	private double ham3;
	private float cheeze1;
	private float cheeze2;
	private float cheeze3;
	private float cheeze4;
	private float cheeze5;

	private BigPizza(int dough1, int dough2, double ham1, double ham2, double ham3, float cheeze1, float cheeze2,
			float cheeze3, float cheeze4, float cheeze5) {
		super();
		this.dough1 = dough1;
		this.dough2 = dough2;
		this.ham1 = ham1;
		this.ham2 = ham2;
		this.ham3 = ham3;
		this.cheeze1 = cheeze1;
		this.cheeze2 = cheeze2;
		this.cheeze3 = cheeze3;
		this.cheeze4 = cheeze4;
		this.cheeze5 = cheeze5;
	}

	public String toString() {
		return String.format(
				"dough1: %d\ndough2: %d\nham1: %f\nham2: %f\nham3: %f\ncheeze1: %f\ncheeze2: %f\ncheeze3: %f\ncheeze4: %f\ncheeze5: %f",
				dough1, dough2, ham1, ham2, ham3, cheeze1, cheeze2, cheeze3, cheeze4, cheeze5);
	}

	public static class Builder {
		private int dough1 = 1;
		private int dough2 = 2;
		private double ham1 = 0.1;
		private double ham2 = 0.2;
		private double ham3 = 0.3;
		private float cheeze1 = 1.1f;
		private float cheeze2 = 1.2f;
		private float cheeze3 = 1.3f;
		private float cheeze4 = 1.4f;
		private float cheeze5 = 1.5f;
		
		public Builder setDough1(int dough1) {
			this.dough1 = dough1;
			return this;
		}
		public Builder setDough2(int dough2) {
			this.dough2 = dough2;
			return this;
		}
		public Builder setHam1(double ham1) {
			this.ham1 = ham1;
			return this;
		}
		public Builder setHam2(double ham2) {
			this.ham2 = ham2;
			return this;
		}
		public Builder setHam3(double ham3) {
			this.ham3 = ham3;
			return this;
		}
		public Builder setCheeze1(float cheeze1) {
			this.cheeze1 = cheeze1;
			return this;
		}
		public Builder setCheeze2(float cheeze2) {
			this.cheeze2 = cheeze2;
			return this;
		}
		public Builder setCheeze3(float cheeze3) {
			this.cheeze3 = cheeze3;
			return this;
		}
		public Builder setCheeze4(float cheeze4) {
			this.cheeze4 = cheeze4;
			return this;
		}
		public Builder setCheeze5(float cheeze5) {
			this.cheeze5 = cheeze5;
			return this;
		}
		
		public BigPizza build() {
			return new BigPizza(dough1, dough2, ham1, ham2, ham3, cheeze1, cheeze2, cheeze3, cheeze4, cheeze5);
		}
	}
}
