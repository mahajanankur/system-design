/**
 * 
 */
package com.sb.designpatterns.decorator.second;

/**
 * @author amahajan
 * 
 */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.print("Adding features of luxury Car.");
	}
}
