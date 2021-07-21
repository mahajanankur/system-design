/**
 * 
 */
package com.java.designpatterns.singleton.first;

/**
 * @author amahajan
 *
 * @written 10-May-2017
 */
public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	// This implementation works fine and provides thread-safety but it reduces
	// the performance because of cost associated with the synchronized method,
	// although we need it only for the first few threads who might create the
	// separate instances. To avoid this extra overhead every time, double
	// checked locking principle is used. In this approach, the synchronized
	// block is used inside the if condition with an additional check to ensure
	// that only one instance of singleton class is created.
	public static synchronized ThreadSafeSingleton getInstance() {
		if (null == instance) {
			instance = new ThreadSafeSingleton();
		}

		return instance;
	}

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (null == instance) {
			synchronized (ThreadSafeSingleton.class) {
				instance = new ThreadSafeSingleton();
			}
		}

		return instance;
	}
}
