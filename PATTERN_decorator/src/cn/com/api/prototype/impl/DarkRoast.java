package cn.com.api.prototype.impl;

import cn.com.api.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.56;
	}

}
