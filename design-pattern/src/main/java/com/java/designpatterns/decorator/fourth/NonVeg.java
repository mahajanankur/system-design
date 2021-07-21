/**
 * 
 */
package com.java.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public class NonVeg extends IngredientDecorator {

	public NonVeg(Sandwich sandwich) {
		super(sandwich);
		System.out.println("Non-Vegitables added.");
	}

	public void getDescription() {
		
		decoratedSandwich.getDescription();
	}

	public int getPrice() {
		int price = decoratedSandwich.getPrice();
		return price + 38;
	}

}
