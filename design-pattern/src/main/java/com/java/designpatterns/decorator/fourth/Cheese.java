/**
 * 
 */
package com.java.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public class Cheese extends IngredientDecorator {

	public Cheese(Sandwich sandwich) {
		super(sandwich);
		System.out.println("Cheese Added.");
	}

	public void getDescription() {
		decoratedSandwich.getDescription();
	}

	public int getPrice() {
		int oldPrice = decoratedSandwich.getPrice();
		return oldPrice + 6;

	}

}
