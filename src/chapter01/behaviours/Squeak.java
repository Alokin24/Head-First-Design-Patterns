package chapter01.behaviours;

import chapter01.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
