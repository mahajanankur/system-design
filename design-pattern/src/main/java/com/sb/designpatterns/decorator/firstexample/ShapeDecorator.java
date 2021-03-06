/**
 * 
 */
package com.sb.designpatterns.decorator.firstexample;

/**
 * @author amahajan
 * 
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape	decoratedShape;

	public ShapeDecorator(Shape shape) {
		decoratedShape = shape;
	}

	public void draw() {
		decoratedShape.draw();
	}

}
