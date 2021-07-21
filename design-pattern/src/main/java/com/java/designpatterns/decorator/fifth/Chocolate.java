/**
 * 
 */
package com.java.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class Chocolate extends AddOnDecorator {

	Bevrages bevrages;

	public Chocolate(Bevrages bevrages) {
		this.bevrages = bevrages;
	}

	@Override
	int cost() {
		return bevrages.cost() + 22;
	}

	@Override
	String getDescription() {
		return bevrages.getDescription() + ", Chocolate";
	}

}
