package cn.com.model;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		name = "chicago cheese pizza";
		dough = "chicago cheese dough";
		sauce = "chicago cheese sauce";
		
		topping.add("chicago cheese topping");
	}
	
	@Override
	public void cut() {
		System.out.println("overRide cut");
	}
}
