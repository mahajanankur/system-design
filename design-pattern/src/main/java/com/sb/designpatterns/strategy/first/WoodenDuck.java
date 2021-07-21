/**
 * 
 */
package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class WoodenDuck extends Duck {

	public WoodenDuck() {
		System.out.println("Wooden Duck");
		setFlyableBehaviour(new NotFly());
		setQuackBehaviour(new SilentQuack());
	}
}
