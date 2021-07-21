/**
 * 
 */
package com.java.designpatterns.observer.second;

/**
 * @author amahajan
 * 
 */
public class StockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockGrabber grabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(grabber);
		grabber.setApplePrice(100.00);
		grabber.setGooglePrice(150.00);
		grabber.setIbmPrice(50.00);

		grabber.unregister(observer1);
		StockObserver observer2 = new StockObserver(grabber);

		grabber.setApplePrice(1.00);
		grabber.setGooglePrice(15.00);
		grabber.setIbmPrice(5.00);

	}

}
