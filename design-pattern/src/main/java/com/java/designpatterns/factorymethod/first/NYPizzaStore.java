/**
 * 
 */
package com.java.designpatterns.factorymethod.first;

/**
 * @author amahajan
 *
 * @written 22-Jun-2017
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type == "cheese") {
			pizza = new NYCheeseBustPizza();
		} else if (type == "veggie") {
			pizza = new NYVeggiePizza();
		}
		return pizza;
	}
}
