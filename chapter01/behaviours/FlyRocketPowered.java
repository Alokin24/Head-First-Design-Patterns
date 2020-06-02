package chapter01.behaviours;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket");
    }
}
