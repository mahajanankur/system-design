/**
 * 
 */
package com.sb.designpatterns.observer.fourth_java_internal;

import java.util.Observable;

/**
 * @author amahajan
 *
 * @written 12-May-2017
 */
public class WeatherData extends Observable {

	private float temprature;

	private float pressure;

	private float humidity;

	/**
	 * @param temprature
	 *            the temprature to set
	 */
	public void setTemprature(float temprature) {
		this.temprature = temprature;
		setChanged();
		notifyObservers();
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		setChanged();
		notifyObservers();
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		setChanged();
		notifyObservers();
	}

	/**
	 * @return the temprature
	 */
	public float getTemprature() {
		return temprature;
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

}
