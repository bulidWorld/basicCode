package cn.com.api.impl;

import cn.com.api.PizzaSotre;
import cn.com.model.ChicagoStyleCheesePizza;
import cn.com.model.ChicagoStyleClamPizza;
import cn.com.model.ChicagoStylePepperoniPizza;
import cn.com.model.ChicagoStyleVeggierPizza;
import cn.com.model.Pizza;

public class ChicagoPizzaStore extends PizzaSotre{
	
	@Override
	protected Pizza createPizza(String type) {
		switch(type){
			case "Clam": return new ChicagoStyleClamPizza();
			case "Pepperoni": return new ChicagoStylePepperoniPizza();
			case "Veggier": return new ChicagoStyleVeggierPizza();
			case "Cheese": return new ChicagoStyleCheesePizza();
			default: return null;
		}
	}
}
