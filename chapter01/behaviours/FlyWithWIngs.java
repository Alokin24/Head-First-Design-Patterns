package chapter01.behaviours;

import chapter01.behaviours.FlyBehaviour;

public class FlyWithWIngs implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
