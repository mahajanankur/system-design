/**
 * 
 */
package com.sb.designpatterns.decorator.third;

/**
 * @author amahajan
 * 
 */
public class PlainPizza implements Pizza {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.third.Pizza#getDesciption()
	 */
	public String getDesciption() {
		return "Plain Pizza";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.third.Pizza#getPrice()
	 */
	public double getPrice() {
		return 400;
	}

}
