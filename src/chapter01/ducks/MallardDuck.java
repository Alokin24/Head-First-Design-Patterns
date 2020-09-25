package chapter01.ducks;

import chapter01.behaviours.FlyWithWIngs;
import chapter01.behaviours.Quack;
import chapter01.ducks.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWIngs();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Im a mallard duck");
    }
}
