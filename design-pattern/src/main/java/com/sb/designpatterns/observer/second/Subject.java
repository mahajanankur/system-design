/**
 * 
 */
package com.sb.designpatterns.observer.second;

/**
 * @author amahajan
 * 
 */
public interface Subject {

	void register(Observer newObserver);

	void unregister(Observer newObserver);

	void notifyObserver();
}
