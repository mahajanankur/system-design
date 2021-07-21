/**
 * 
 */
package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class CanFly implements FlyableBehaviour {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.strategy.first.FlyableBehaviour#fly()
	 */
	@Override
	public void fly() {
		System.out.println("This can fly.");

	}

}
