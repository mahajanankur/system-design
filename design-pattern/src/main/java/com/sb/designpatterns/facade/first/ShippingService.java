/**
 * 
 */
package com.sb.designpatterns.facade.first;

/**
 * @author ankur.mahajan
 * @written 09-Jul-2019
 */
public class ShippingService implements CustomerCare {

	public ShippingService() {
		//System.out.println("Inside Shipping Service.");
	}

	@Override
	public void request() {
		System.out.println("SHIPPING request has been raised.");

	}

}
