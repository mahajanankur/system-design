package com.java.designpatterns.decorator.third;

public class PizzaDemo {

	public static void main(String[] args) {
		Pizza pizza = new CheeseBust(new FreshVeggies(new PlainPizza()));
		
		System.out.println("Ingredients : " + pizza.getDesciption());

		System.out.println("Price : " + pizza.getPrice());
	}

}
