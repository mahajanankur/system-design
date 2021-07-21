/**
 * 
 */
package com.java.designpatterns.decorator.fifth;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class PatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bevrages bevrages1 = new Frape();
		System.out.println(bevrages1.getDescription() + " ,$Cost = " + bevrages1.cost());

		Bevrages bevrages2 = new Capacinno();
		bevrages2 = new Milk(bevrages2);
		bevrages2 = new Chocolate(bevrages2);
		bevrages2 = new Chocolate(bevrages2);
		System.out.println(bevrages2.getDescription() + " ,$Cost = " + bevrages2.cost());
	}

}
