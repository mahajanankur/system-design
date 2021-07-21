/**
 * 
 */
package com.java.designpatterns.decorator.third;

/**
 * @author amahajan
 * 
 */
public class CheeseBust extends ToppingDecorator {

	public CheeseBust(Pizza pizza) {
		super(pizza);
		System.out.println("Cheese Bust.");
	}

	public String getDesciption() {
		return tempPizza.getDesciption() + ", CheeseBust";
	}

	public double getPrice() {
		return tempPizza.getPrice() + 110;
	}
}
