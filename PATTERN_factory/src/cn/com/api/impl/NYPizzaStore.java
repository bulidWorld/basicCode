package cn.com.api.impl;

import cn.com.api.PizzaSotre;
import cn.com.model.NYStyleCheesePizza;
import cn.com.model.NYStyleClamPizza;
import cn.com.model.NYStylePepperoniPizza;
import cn.com.model.NYStyleVeggierPizza;
import cn.com.model.Pizza;

public class NYPizzaStore extends PizzaSotre{

	@Override
	protected Pizza createPizza(String type) {
		switch(type){
		case "Clam": return new NYStyleClamPizza();
		case "Pepperoni": return new NYStylePepperoniPizza();
		case "Veggier": return new NYStyleVeggierPizza();
		case "Cheese": return new NYStyleCheesePizza();
		default: return null;
	}}

}
