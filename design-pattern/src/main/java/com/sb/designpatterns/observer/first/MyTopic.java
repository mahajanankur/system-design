/**
 * 
 */
package com.sb.designpatterns.observer.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amahajan
 * 
 */
public class MyTopic implements Subject {

	private List<Observer>	observers;

	private String			message;

	private boolean			changed;

	private final Object	MUTEX	= new Object();

	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		if (o == null) {
			throw new NullPointerException("Null Observer");
		}
		synchronized (MUTEX) {
			if (!observers.contains(o)) {
				observers.add(o);
			}
		}
	}

	public void unregisterObserver(Observer o) {
		synchronized (MUTEX) {
			observers.remove(o);
		}

	}

	public void notifyObserver() {
		List<Observer> observerLocal = null;
		// synchronization is used to make sure any observer registered after
		// message is received is not notified
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			observerLocal = new ArrayList<Observer>(this.observers);
			this.changed = false;
		}
		for (Observer ob : observerLocal) {
			ob.update();
		}
	}

	public Object getUpdate(Observer o) {
		return this.message;
	}

	// method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message posted to subject, " + msg);
		this.message = msg;
		this.changed = true;
		notifyObserver();
	}
}
