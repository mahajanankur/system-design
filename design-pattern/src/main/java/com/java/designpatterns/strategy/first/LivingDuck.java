/**
 * 
 */
package com.java.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class LivingDuck extends Duck {

	public LivingDuck() {
		System.out.println("Living Duck");
		setFlyableBehaviour(new CanFly());
		setQuackBehaviour(new CanQuack());
	}

}
