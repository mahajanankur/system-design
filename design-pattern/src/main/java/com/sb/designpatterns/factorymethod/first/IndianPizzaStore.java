/**
 * 
 */
package com.sb.designpatterns.factorymethod.first;

/**
 * @author amahajan
 *
 * @written 22-Jun-2017
 */
public class IndianPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type == "cheese") {
			pizza = new IndianCheeseBustPizza();
		} else if (type == "veggie") {
			pizza = new IndianVeggiePizza();
		}
		return pizza;
	}

}
