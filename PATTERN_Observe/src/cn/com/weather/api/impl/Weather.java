package cn.com.weather.api.impl;

import java.util.HashSet;
import java.util.Set;

import cn.com.api.Observable;
import cn.com.api.Subject;

public class Weather implements Subject{
	
	private Set<Observable> observers = new HashSet<Observable>();
	
	
	@Override
	public void measureChanged(){
		notifyOberve();
	}
	
	@Override
	public void registerObserve(Observable observe) {
		observers.add(observe);
	}

	@Override
	public void notifyOberve() {
		for (Observable observer : observers) {
			observer.action();
		}
	}

	@Override
	public boolean removeObserve(Observable obser) {
		return observers.remove(obser);
	}

}
