package cn.com.api;

import cn.com.model.Pizza;

public abstract class PizzaSotre {
	
	public void orderPizza(String type){
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
	}
	
	protected abstract Pizza createPizza(String type);
}
