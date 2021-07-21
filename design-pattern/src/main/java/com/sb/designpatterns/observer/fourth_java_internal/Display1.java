///**
// * 
// */
package com.sb.designpatterns.observer.fourth_java_internal;

import java.util.Observable;
import java.util.Observer;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class Display1 implements Observer {

	public Display1(Observable observable) {
		observable.addObserver(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			float temprature = data.getTemprature();
			float humidity = data.getHumidity();
			float pressure = data.getPressure();
			System.out.println("Current Conditions are : " + " TEMPRATURE : " + temprature + " , HUMIDITY : " + humidity
					+ " , PRESSURE : " + pressure);
		} else
			System.out.println("Wrong Format");

	}

}
