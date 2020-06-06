package chapter03.custom_example.sizes;

import chapter03.custom_example.ComponentSize;

public class Grande extends ComponentSize {

    public Grande() {
        description = "Grande";
    }

    @Override
    public double cost() {
        return 0.15;
    }
}
