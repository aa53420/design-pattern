package strategy.duck;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Decoy duck display");
    }
}
