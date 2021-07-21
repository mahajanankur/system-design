/**
 * 
 */
package com.java.designpatterns.observer.third;

/**
 * @author amahajan
 *
 * @written 11-May-2017
 */
public class PatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData subject = new WeatherData();
		Display1 display1 = new Display1(subject);

		subject.setTemprature(45.4f);
		subject.setHumidity(20);
		subject.setPressure(60f);
		// unregiser display1
		subject.unregisterObserver(display1);

		Display1 display2 = new Display1(subject);
		subject.setTemprature(100);
		subject.setHumidity(100);
		subject.setPressure(100);

	}

}
