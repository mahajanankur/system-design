/**
 * 
 */
package com.java.designpatterns.factory.first;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class Add implements Calculate {

	@Override
	public void calculate(int a, int b) {
		System.out.println("Adding two numbers.");
		int c = a + b;
		System.out.println("a + b = " + c);

	}

}
