/**
 * 
 */
package com.sb.designpatterns.observer.third;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amahajan
 *
 * @written 11-May-2017
 */
public class WeatherData implements Subject {

	private List<Observer> observers;

	private float temprature;

	private float humidity;

	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpatterns.observer.third.Subject#registerObserver(com.java.
	 * designpatterns.observer.third.Observer)
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		System.out.println(observer + " is regisetred successfully.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.java.designpatterns.observer.third.Subject#unregisterObserver(com.
	 * java.designpatterns.observer.third.Observer)
	 */
	@Override
	public void unregisterObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
			System.out.println(observer + " is unregisetred successfully.");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.java.designpatterns.observer.third.Subject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temprature, humidity, pressure);
		}

	}

	/**
	 * @return the temprature
	 */
	public float getTemprature() {
		return temprature;
	}

	/**
	 * @param temprature
	 *            the temprature to set
	 */
	public void setTemprature(float temprature) {
		this.temprature = temprature;
		notifyObserver();
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		notifyObserver();
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		notifyObserver();
	}

}
