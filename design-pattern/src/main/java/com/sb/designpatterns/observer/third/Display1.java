package com.sb.designpatterns.observer.third;

public class Display1 implements Observer {

	// private Subject subject;

	// private float temprature;
	//
	// private float humidity;
	//
	// private float pressure;

	public Display1(Subject subject) {
		// this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(float temprature, float humidity, float pressure) {
		// this.temprature = temprature;
		// this.humidity = humidity;
		// this.pressure = pressure;
		System.out.println("Current Conditions are : " + " TEMPRATURE : " + temprature + " , HUMIDITY : " + humidity
				+ " , PRESSURE : " + pressure);

	}

}
