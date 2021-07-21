/**
 * 
 */
package com.java.designpatterns.decorator.second;

/**
 * @author amahajan
 * 
 */
public abstract class CarDecorator implements Car {

	protected Car	car;

	public CarDecorator(Car car) {
		this.car = car;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.decorator.second.Car#assamble()
	 */
	public void assemble() {
		car.assemble();

	}

}
