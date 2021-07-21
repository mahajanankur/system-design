/**
 * 
 */
package com.sb.designpatterns.facade.first;

/**
 * @author ankur.mahajan
 * @written 09-Jul-2019
 */
public class BillingService implements CustomerCare {

	public BillingService() {
		//System.out.println("Inside Billing Service.");
	}

	@Override
	public void request() {
		System.out.println("BILLING request has been raised.");

	}

}
