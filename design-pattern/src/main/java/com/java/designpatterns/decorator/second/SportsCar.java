/**
 * 
 */
package com.java.designpatterns.decorator.second;

/**
 * @author amahajan
 * 
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.println("Adding feature of sports car.");
	}
}
