/**
 * 
 */
package com.java.designpatterns.observer.third;

/**
 * @author amahajan
 *
 * @written 11-May-2017
 */
public interface Subject {

	void registerObserver(Observer observer);

	void unregisterObserver(Observer observer);

	void notifyObserver();
}
