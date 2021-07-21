/**
 * 
 */
package com.sb.designpatterns.factory.first;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CalculateFactory factory = new CalculateFactory();
		Calculate calculation = factory.getCalculation("multiply");
		calculation.calculate(10, 30);

	}

}
