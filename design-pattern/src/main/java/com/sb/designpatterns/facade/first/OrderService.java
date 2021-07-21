/**
 * 
 */
package com.sb.designpatterns.facade.first;

/**
 * @author ankur.mahajan
 * @written 09-Jul-2019
 */
public class OrderService implements CustomerCare {

	public OrderService() {
		//System.out.println("Inside Order Service.");
	}

	@Override
	public void request() {
		System.out.println("ORDER request has been raised.");

	}

}
