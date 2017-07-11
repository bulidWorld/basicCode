package cn.com.api.prototype.impl;

import cn.com.api.Beverage;

public class Decat extends Beverage{

	public Decat() {
		description = "Decat";
	}
	
	@Override
	public double cost() {
		return 2.33;
	}

}
