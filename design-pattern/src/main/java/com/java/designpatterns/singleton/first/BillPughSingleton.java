/**
 * 
 */
package com.java.designpatterns.singleton.first;

/**
 * @author amahajan
 *
 * @written 10-May-2017
 * 
 *          Notice the private inner static class that contains the instance of
 *          the singleton class. When the singleton class is loaded,
 *          SingletonHelper class is not loaded into memory and only when
 *          someone calls the getInstance method, this class gets loaded and
 *          creates the Singleton class instance. This is the most widely used
 *          approach for Singleton class as it doesn’t require synchronization.
 */
public class BillPughSingleton {

	private BillPughSingleton() {

	}

	private static class SingletonHelper {

		private static BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {

		return SingletonHelper.instance;
	}
}
