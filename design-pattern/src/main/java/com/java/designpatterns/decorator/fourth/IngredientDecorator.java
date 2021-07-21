/**
 * 
 */
package com.java.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public abstract class IngredientDecorator implements Sandwich {

	protected Sandwich	decoratedSandwich;

	public IngredientDecorator(Sandwich sandwich) {
		decoratedSandwich = sandwich;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getDescription()
	 */
	public void getDescription() {
		decoratedSandwich.getDescription();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getPrice()
	 */
	public int getPrice() {
		int cost = decoratedSandwich.getPrice();
		return cost;
	}

}
