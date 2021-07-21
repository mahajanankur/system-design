/**
 * 
 */
package com.java.designpatterns.facade.first;

/**
 * @author ankur.mahajan
 * @written 09-Jul-2019
 * 
 *          All complex services are wrapped around it to provide simple
 *          interface to Clients/Users.
 * 
 *          Most of time it should be singleton. But be careful about singleton.
 */
public class CustomerFacade {

	private BillingService billingService;

	private OrderService orderService;

	private ShippingService shippingService;

	public CustomerFacade() {
		billingService = new BillingService();
		orderService = new OrderService();
		shippingService = new ShippingService();
	}

	public void raiseBillingRequest() {
		billingService.request();
	}

	public void raiseOrderRequest() {
		orderService.request();
	}

	public void raiseShippingRequest() {
		shippingService.request();
	}
}
