/**
 * 
 */
package com.java.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class NotFly implements FlyableBehaviour {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.strategy.first.FlyableBehaviour#fly()
	 */
	@Override
	public void fly() {
		System.out.println("Not Fly.");

	}

}
