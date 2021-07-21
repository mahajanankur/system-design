/**
 * 
 */
package com.sb.designpatterns.factorymethod.first;

/**
 * @author amahajan
 *
 * @written 22-Jun-2017
 */
public abstract class Pizza {

	void bake() {
		System.out.println("Bake for 25 mins.");
	}

	void cut() {
		System.out.println("Cut the pizzas in diagonal slices.");
	}

	void box() {
		System.out.println("Place pizza in official pizza store box.");
	}

}
