/**
 * 
 */
package com.sb.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class Milk extends AddOnDecorator {

	Bevrages bevrages;

	public Milk(Bevrages bevrages) {
		this.bevrages = bevrages;
	}

	@Override
	int cost() {
		return bevrages.cost() + 10;
	}

	@Override
	String getDescription() {
		return bevrages.getDescription() + ", Milk";
	}

}
