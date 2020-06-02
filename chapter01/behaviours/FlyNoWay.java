package chapter01.behaviours;

import chapter01.behaviours.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cant fly");
    }
}
