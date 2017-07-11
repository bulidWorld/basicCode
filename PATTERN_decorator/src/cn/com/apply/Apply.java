package cn.com.apply;

import cn.com.api.Beverage;
import cn.com.api.decorator.impl.Mocha;
import cn.com.api.decorator.impl.Soy;
import cn.com.api.prototype.impl.DarkRoast;

public class Apply {
	public static void main(String[] args) {
		Beverage mochaRoast = new Mocha(new DarkRoast(), 100.01); 
		System.out.println(mochaRoast.getDescription());
		System.out.println(mochaRoast.cost());
		
		System.out.println("-------------------");
		
		Beverage mochaSoyRoast = new Soy(mochaRoast, 500.6);
		System.out.println(mochaSoyRoast.getDescription());
		System.out.println(mochaSoyRoast.cost());
	}
}
