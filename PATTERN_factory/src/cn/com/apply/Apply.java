package cn.com.apply;

import cn.com.api.PizzaSotre;
import cn.com.api.impl.ChicagoPizzaStore;
import cn.com.api.impl.NYPizzaStore;
import cn.com.model.Pizza;

public class Apply {
	public static void main(String[] args) {
		PizzaSotre pizzaSotre = new ChicagoPizzaStore();
		pizzaSotre.orderPizza("Cheese");
		
		pizzaSotre = new NYPizzaStore();
		pizzaSotre.orderPizza("Clam");
		
	}
}
