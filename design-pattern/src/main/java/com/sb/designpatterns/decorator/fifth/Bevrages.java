/**
 * 
 */
package com.sb.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public abstract class Bevrages {

	String description = "Unknown Drink";

	String getDescription() {
		return description;
	}

	abstract int cost();
}
