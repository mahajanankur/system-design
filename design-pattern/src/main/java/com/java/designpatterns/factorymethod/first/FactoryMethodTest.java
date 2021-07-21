/**
 * 
 */
package com.java.designpatterns.factorymethod.first;

/**
 * @author amahajan
 *
 * @written 22-Jun-2017
 */
public class FactoryMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore indianStore = new IndianPizzaStore();

		nyStore.orderPizza("cheese");
		indianStore.orderPizza("veggie");
	}

}
