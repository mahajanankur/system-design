/**
 * 
 */
package com.sb.designpatterns.factory.first;

/**
 * @author ankur.mahajan
 * @written 09-Jun-2019
 */
public class CalculateFactory {

	public Calculate getCalculation(String type) {
		Calculate calculate = null;
		if (type.toLowerCase().equals("add")) {
			calculate = new Add();
		} else if (type.toLowerCase().equals("subtract")) {
			calculate = new Subtract();
		} else if (type.toLowerCase().equals("multiply")) {
			calculate = new Multiply();
		} else {
			System.out.println("Not supported!!");
		}
		return calculate;
	}

}
