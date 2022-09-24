import Fly.FlyNoWay;
import Quack.MuteQuack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		setQuackBehavior(new MuteQuack());
		setFlyBehavior(new FlyNoWay());
	}
	
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리 입니다.");
		
	}
	

}
