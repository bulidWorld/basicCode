package cn.com.api.decorator.impl;

import cn.com.api.Beverage;
import cn.com.api.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	
	private Beverage beverage;
	
	private double price;
	
	public Mocha(Beverage beverage, double price) {
		this.beverage = beverage;
		this.price = price;
	}
	
	
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
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
