/**
 * 
 */
package com.java.designpatterns.observer.first;

/**
 * @author amahajan
 * 
 */
public interface Observer {

	// method to update the observer, used by subject
	void update();

	// attach with subject to observe
	void setSubject(Subject s);
}
