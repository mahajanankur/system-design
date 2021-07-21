/**
 * 
 */
package com.sb.designpatterns.strategy.first;

/**
 * @author amahajan
 *
 * @written 06-May-2017
 */
public abstract class Duck {

	FlyableBehaviour flyableBehaviour;

	QuackBehaviour quackBehaviour;

	public void getFlyableBehaviour() {
		flyableBehaviour.fly();
	}

	public void getQuackBehaviour() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("Can Swim.");
	}

	/**
	 * @param flyableBehaviour
	 *            the flyableBehaviour to set
	 */
	public void setFlyableBehaviour(FlyableBehaviour flyableBehaviour) {
		this.flyableBehaviour = flyableBehaviour;
	}

	/**
	 * @param quackBehaviour
	 *            the quackBehaviour to set
	 */
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

}
