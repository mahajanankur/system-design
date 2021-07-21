/**
 * 
 */
package com.sb.designpatterns.decorator.fourth;

/**
 * @author amahajan
 *
 */
public class BrownBreadSandwich implements Sandwich {

	/* (non-Javadoc)
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getDescription()
	 */
	public void getDescription() {
		System.out.println("Brown bread sandwich.");

	}

	/* (non-Javadoc)
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getPrice()
	 */
	public int getPrice() {
		int cost = 50;
		return cost;
	}

}
