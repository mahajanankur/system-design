/**
 * 
 */
package com.java.designpatterns.facade.first;

/**
 * @author ankur.mahajan
 * @written 09-Jul-2019
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerFacade facade = new CustomerFacade();
		facade.raiseBillingRequest();

		// Hidden all the complexities, user has to just invoke a function.
		facade.raiseOrderRequest();

	}

}
