package chapter01.ducks;

import chapter01.behaviours.FlyNoWay;
import chapter01.behaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Im a model duck");
    }
}
