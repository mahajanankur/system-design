/**
 * 
 */
package com.java.designpatterns.builder.first;

/**
 * @author ankur.mahajan
 * @written 23-Nov-2018
 * 
 * This pattern is used to 
 */
public class NutritionFacts {

	private int servingSize;

	private int servings;

	private int calories;

	private int fat;

	private int sodium;

	private int carbohydrate;

	public NutritionFacts(Builder builder) {
		this.calories = builder.calories;
		this.carbohydrate = builder.carbohydrate;
		this.fat = builder.fat;
		this.servings = builder.servings;
		this.servingSize = builder.servingSize;
		this.sodium = builder.sodium;
	}

	static class Builder {

		private int servingSize;

		private int servings;

		private int calories = 0;

		private int fat = 0;

		private int sodium = 0;

		private int carbohydrate = 0;

		/**
		 * @param servingSize
		 *            the servingSize to set
		 */
		public Builder setServingSize(int servingSize) {
			this.servingSize = servingSize;
			return this;
		}

		/**
		 * @param servings
		 *            the servings to set
		 */
		public Builder setServings(int servings) {
			this.servings = servings;
			return this;
		}

		/**
		 * @param calories
		 *            the calories to set
		 */
		public Builder setCalories(int calories) {
			this.calories = calories;
			return this;
		}

		/**
		 * @param fat
		 *            the fat to set
		 */
		public Builder setFat(int fat) {
			this.fat = fat;
			return this;
		}

		/**
		 * @param sodium
		 *            the sodium to set
		 */
		public Builder setSodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		/**
		 * @param carbohydrate
		 *            the carbohydrate to set
		 */
		public Builder setCarbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	// Getter Methods
	/**
	 * @return the servingSize
	 */
	public int getServingSize() {
		return servingSize;
	}

	/**
	 * @return the servings
	 */
	public int getServings() {
		return servings;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @return the fat
	 */
	public int getFat() {
		return fat;
	}

	/**
	 * @return the sodium
	 */
	public int getSodium() {
		return sodium;
	}

	/**
	 * @return the carbohydrate
	 */
	public int getCarbohydrate() {
		return carbohydrate;
	}

}
