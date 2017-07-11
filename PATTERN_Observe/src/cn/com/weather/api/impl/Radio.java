package cn.com.weather.api.impl;

import cn.com.api.Observable;
import cn.com.api.Subject;

public class Radio implements Observable{

	private Subject subject;
	
	@Override
	public void action() {
		announce();
	}
	
	private void announce(){
		System.out.println("announce wearther");
	}
	
}
