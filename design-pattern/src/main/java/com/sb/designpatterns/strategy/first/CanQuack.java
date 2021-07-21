package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class CanQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Can quack.");

	}

}
