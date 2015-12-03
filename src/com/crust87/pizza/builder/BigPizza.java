package com.crust87.pizza.builder;

/**
 * Builder Pattern 예제2
 * 너무 많은 parameter에 대응하기위한 Builder Pattern 변형 
 * 
 * @author mabi
 *
 */
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

	// Constructor가 10개의 Parameter를 가지고 있으며 각각의 기본값이 존재한다.
	// 외부에서 이 Constructor를 직접 사용하지 않도록 하고 Builder를 통해 생성하도록 한다.
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

	// 많은 Parameter에 대응하기위한 Builder
	public static class Builder {
		private boolean isReuse;

		// 각각의 초기값을 가진다.
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

		// build()를 통해 객체를 생성함
		public BigPizza build() {
			BigPizza bigPizza = new BigPizza(dough1, dough2, ham1, ham2, ham3, cheeze1, cheeze2, cheeze3, cheeze4, cheeze5);

			// isReuse 여부에 따라 값을 초기화 하거나 초기화 하지 않는다.
			if (!isReuse) {
				init();
			}

			return bigPizza;
		}

		// 초기화 Method
		private void init() {
			dough1 = 1;
			dough2 = 2;
			ham1 = 0.1;
			ham2 = 0.2;
			ham3 = 0.3;
			cheeze1 = 1.1f;
			cheeze2 = 1.2f;
			cheeze3 = 1.3f;
			cheeze4 = 1.4f;
			cheeze5 = 1.5f;
		}

		// 세팅 재사용 여부를 컨트롤하기위한 Method
		public Builder setReuse(boolean isReuse) {
			this.isReuse = isReuse;
			return this;
		}

		// 값 세팅
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
	}
}
