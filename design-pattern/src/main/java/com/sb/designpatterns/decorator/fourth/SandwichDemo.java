/**
 * 
 */
package com.sb.designpatterns.decorator.fourth;

/**
 * @author amahajan
 * 
 */
public class SandwichDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich sandwich1 = new Cheese(new NonVeg(new BrownBreadSandwich()));
		System.out.println("Price : " + sandwich1.getPrice());
		
	}

}
