package cn.com.api.decorator.impl;

import cn.com.api.Beverage;
import cn.com.api.CondimentDecorator;

public class Whip extends CondimentDecorator{
	
	private Beverage beverage;
	
	private double price;
	
	public void setBeverage(Beverage beverage, double price) {
		this.beverage = beverage;
		this.price = price;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
