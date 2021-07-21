/**
 * 
 */
package com.java.designpatterns.decorator.third;

/**
 * @author amahajan
 * 
 */
public abstract class ToppingDecorator implements Pizza {

	protected Pizza	tempPizza;

	public ToppingDecorator(Pizza pizza) {
		tempPizza = pizza;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.third.Pizza#getDesciption()
	 */
	public String getDesciption() {
		return tempPizza.getDesciption();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.third.Pizza#getPrice()
	 */
	public double getPrice() {
		return tempPizza.getPrice();
	}

}
