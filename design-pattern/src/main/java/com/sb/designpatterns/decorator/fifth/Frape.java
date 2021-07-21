/**
 * 
 */
package com.sb.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class Frape extends Bevrages {

	public Frape() {
		description = "Frape";
	}

	@Override
	int cost() {
		return 150;
	}

}
