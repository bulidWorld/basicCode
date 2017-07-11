package cn.com.weather.jdk.impl;

import java.util.Observable;
import java.util.Observer;

public class PhoneApp implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		WeatherData data = (WeatherData)arg;
		ring(data);
		
	}
	private void ring(WeatherData data){
		System.out.println(data);
		System.out.println("ring");
	}

}
