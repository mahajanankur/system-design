/**
 * 
 */
package com.sb.designpatterns.factory.first;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class Multiply implements Calculate {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Multiplying two numbers.");
		int c = a * b;
		System.out.println("a * b = " + c);
	}

}
