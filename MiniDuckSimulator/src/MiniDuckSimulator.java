import Fly.FlyRocketPowered;

import Fly.FlyWithWings;
import Quack.Quack;
import Quack.QuackBehavior;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		
		mallard.setFlyBehavior(new FlyWithWings());
		mallard.setQuackBehavior(new Quack());
				
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		
		model.display();
		model.performQuack();
		model.performFly();
		
		model.setFlyBehavior(new FlyRocketPowered());
		
		model.performFly();
		
		
		

	}

}
