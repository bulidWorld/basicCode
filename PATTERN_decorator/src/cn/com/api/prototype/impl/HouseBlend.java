package cn.com.api.prototype.impl;

import cn.com.api.Beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return 2.22;
	}
	
}
