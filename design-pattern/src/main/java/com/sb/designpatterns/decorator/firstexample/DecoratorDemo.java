/**
 * 
 */
package com.sb.designpatterns.decorator.firstexample;

/**
 * @author amahajan
 * 
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShape(new Circle());

		Shape redRectangle = new RedShape(new Rectangle());

		System.out.println("Normal Border");
		circle.draw();

		System.out.println("\nCircle of red Border");
		redCircle.draw();

		System.out.println("\nRectangle of red Border");
		redRectangle.draw();

	}

}
