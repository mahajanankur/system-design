/**
 * 
 */
package com.java.designpatterns.decorator.second;

/**
 * @author amahajan
 * 
 */
public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car sportCar = new SportsCar(new BasicCar());
		sportCar.assemble();
		System.out.println("\n");

		Car sportLuxury = new SportsCar(new LuxuryCar(new BasicCar()));
		sportLuxury.assemble();

	}

}
