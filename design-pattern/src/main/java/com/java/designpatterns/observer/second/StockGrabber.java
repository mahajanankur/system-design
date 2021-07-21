/**
 * 
 */
package com.java.designpatterns.observer.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amahajan
 * 
 */
public class StockGrabber implements Subject {

	List<Observer>	observers;
	private double	applePrice;
	private double	googlePrice;
	private double	ibmPrice;

	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.observer.second.Subject#register(com.java.
	 * designpatterns.observer.second.Observer)
	 */
	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.observer.second.Subject#unregister(com.java.
	 * designpatterns.observer.second.Observer)
	 */
	public void unregister(Observer newObserver) {
		int index = observers.indexOf(newObserver);
		System.out.println("Observer " + (index + 1) + " deleted");
		observers.remove(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.observer.second.Subject#notifyObserver()
	 */
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(applePrice, googlePrice, ibmPrice);
		}

	}

	/**
	 * @param applePrice
	 *            the applePrice to set
	 */
	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	/**
	 * @param googlePrice
	 *            the googlePrice to set
	 */
	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

	/**
	 * @param ibmPrice
	 *            the ibmPrice to set
	 */
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

}
