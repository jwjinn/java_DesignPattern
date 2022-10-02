
public class Mocha extends condimentDecorator{
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return beverage.cost() + .2;
	}
	
	

}
