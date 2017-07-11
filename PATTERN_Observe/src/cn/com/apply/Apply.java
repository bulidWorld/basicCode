package cn.com.apply;

import cn.com.api.Observable;
import cn.com.api.Subject;
import cn.com.weather.api.impl.Radio;
import cn.com.weather.api.impl.Weather;
import cn.com.weather.api.impl.WeatherPhoneApp;
import cn.com.weather.jdk.impl.PhoneApp;
import cn.com.weather.jdk.impl.WeatherData;

public class Apply {
	public static void main(String[] args) {
		testJDK();
	}
	
	static void testCustomize(){
		Subject weatherSub = new Weather();
		Observable radio = new Radio();
		weatherSub.registerObserve(new WeatherPhoneApp());
		weatherSub.registerObserve(radio);
		
		weatherSub.measureChanged();
		System.out.println("--------------");
		weatherSub.removeObserve(radio);
		weatherSub.measureChanged();
		
	}
	
	static void testJDK(){
		cn.com.weather.jdk.impl.Weather sujectInJDK = new cn.com.weather.jdk.impl.Weather(new WeatherData("Œ‰∫∫", 0.98));
		sujectInJDK.addObserver(new PhoneApp());
		sujectInJDK.measureChanged();
	}
}
