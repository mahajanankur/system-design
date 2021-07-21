/**
 * 
 */
package com.java.designpatterns.observer.second;

/**
 * @author amahajan
 * 
 */
public class StockObserver implements Observer {

	private static int	observerIDTracker	= 0;
	private int			observerId;

	public StockObserver(Subject stockGrabber) {
		this.observerId = ++observerIDTracker;
		System.out.println("New Observer : " + observerId);
		stockGrabber.register(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.observer.second.Observer#update(double,
	 * double, double)
	 */
	public void update(double applePrice, double googlePrice, double ibmPrice) {
		System.out.println("Observer : " + observerId + "\n" + "\nApplePrice :"
				+ applePrice + "\n" + "\nGooglePrice :" + googlePrice + "\n"
				+ "\nIBM Price :" + ibmPrice + "\n");

	}
}
