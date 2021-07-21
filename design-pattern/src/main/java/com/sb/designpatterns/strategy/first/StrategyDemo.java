/**
 * 
 */
package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public class StrategyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck living = new LivingDuck();
		living.getFlyableBehaviour();
		living.getQuackBehaviour();

		System.out.println("Wooden Duck Test");
		Duck wooden = new WoodenDuck();
		wooden.getFlyableBehaviour();
		wooden.getQuackBehaviour();

	}

}
