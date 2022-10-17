package PizzaStore;

import Pizza.ChicagoStyleCheesePizza;
import Pizza.NYStyleCheesePizza;
import Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		
		return pizza;
	}
	
	

}
