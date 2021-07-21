/**
 * 
 */
package com.java.designpatterns.decorator.third;

/**
 * @author amahajan
 * 
 */
public class FreshVeggies extends ToppingDecorator {

	public FreshVeggies(Pizza pizza) {
		super(pizza);
		System.out.println("Adding fresh veggies topping.");
	}

	public String getDesciption() {
		return tempPizza.getDesciption() + ", Fresh Veggies";
	}

	public double getPrice() {
		return tempPizza.getPrice() + 90;
	}
}
