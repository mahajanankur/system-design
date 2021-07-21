/**
 * 
 */
package com.sb.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public class WhiteBreadSandwich implements Sandwich {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getDescription()
	 */
	public void getDescription() {
		System.out.println("White Bread Sandwich.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.fourth.Sandwich#getPrice()
	 */
	public int getPrice() {
		int cost = 30;
		return cost;
	}

}
