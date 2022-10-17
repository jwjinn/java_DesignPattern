package PizzaStore;

import Pizza.NYStyleCheesePizza;
import Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		
		return pizza;
		
	}

	

}
