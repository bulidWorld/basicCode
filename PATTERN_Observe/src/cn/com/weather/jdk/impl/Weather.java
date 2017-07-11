package cn.com.weather.jdk.impl;

import java.util.Observable;

public class Weather extends Observable{
	
	private WeatherData weatherData;
	
	public Weather(WeatherData data) {
		this.weatherData = data;
	}
	
	public void measureChanged(){
		setChanged();
		notifyObservers(weatherData);
	}
}
