/**
 * 
 */
package com.sb.designpatterns.factorymethod.first;

/**
 * @author amahajan
 *
 * @written 22-Jun-2017
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;

	}

	abstract Pizza createPizza(String type);

}
