/**
 * 
 */
package com.sb.designpatterns.singleton.first;

/**
 * @author amahajan
 *
 * @written 10-May-2017
 * 
 *          Static block initialization creates the instance even before it’s
 *          being used and that is not the best practice to use
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {

	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Unable to make instance.");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
