package cn.com.weather.jdk.impl;


public class WeatherData{
	private String city;
	
	private double huminity;

	public WeatherData(String city, double huminity) {
		this.city = city;
		this.huminity = huminity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getHuminity() {
		return huminity;
	}

	public void setHuminity(double huminity) {
		this.huminity = huminity;
	}
	
	@Override
	public String toString() {
		return city + ":" + huminity;
	}
}
