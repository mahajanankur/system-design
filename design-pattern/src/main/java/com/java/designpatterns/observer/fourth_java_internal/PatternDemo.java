/**
 * 
 */
package com.java.designpatterns.observer.fourth_java_internal;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class PatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData observable = new WeatherData();

		Display1 observer1 = new Display1(observable);
		observable.setHumidity(1);
		observable.setPressure(2);
		observable.setTemprature(3);
		// observable.deleteObserver(observer1);
		Display1 observer2 = new Display1(observable);

		observable.setHumidity(33);
		observable.setPressure(44);
		observable.setTemprature(55);

	}

}
