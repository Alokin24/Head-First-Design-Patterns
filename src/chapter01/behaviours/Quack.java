package chapter01.behaviours;

import chapter01.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
