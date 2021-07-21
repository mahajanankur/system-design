/**
 * 
 */
package com.sb.designpatterns.decorator.firstexample;

/**
 * @author amahajan
 * 
 */
public class RedShape extends ShapeDecorator {

	public RedShape(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setBorderColor();
	}

	private void setBorderColor() {
		System.out.println("Border : Red");
	}

}
