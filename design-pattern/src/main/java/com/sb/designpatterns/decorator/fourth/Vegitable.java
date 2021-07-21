/**
 * 
 */
package com.sb.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public class Vegitable extends IngredientDecorator {

	public Vegitable(Sandwich sandwich) {
		super(sandwich);
		System.out.println("Vegitables added.");
	}

	public void getDescription() {
		decoratedSandwich.getDescription();
	}

	public int getPrice() {
		int price = decoratedSandwich.getPrice();
		return price + 18;
	}
}
