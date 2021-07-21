/**
 * 
 */
package com.sb.designpatterns.observer.first;

/**
 * @author amahajan
 * 
 */
public interface Subject {

	// methods to register and unregister observers
	void registerObserver(Observer o);

	void unregisterObserver(Observer o);

	// method to notify observers of change
	void notifyObserver();

	// method to get updates from subject
	Object getUpdate(Observer o);
}
