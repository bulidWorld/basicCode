package cn.com.weather.api.impl;

import cn.com.api.Observable;

public class WeatherPhoneApp implements Observable{

	@Override
	public void action() {
		ring();
	}
	
	private void ring(){
		//TODO STH
		System.out.println("ring");
	}
}
