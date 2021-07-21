/**
 * 
 */
package com.sb.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class Latte extends Bevrages {

	public Latte() {
		description = "Latte";
	}

	@Override
	int cost() {
		return 50;
	}

}
