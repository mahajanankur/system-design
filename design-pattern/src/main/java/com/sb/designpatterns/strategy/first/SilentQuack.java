/**
 * 
 */
package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class SilentQuack implements QuackBehaviour {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.strategy.first.QuackBehaviour#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Silent Duck.");

	}

}
