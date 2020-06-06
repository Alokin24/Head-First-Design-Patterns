package chapter03.custom_example.sizes;

import chapter03.custom_example.ComponentSize;

public class Tall extends ComponentSize {

    public Tall() {
        description = "Tall";
    }

    @Override
    public double cost() {
        return 0.10;
    }
}
