package chapter03.custom_example.sizes;

import chapter03.custom_example.ComponentSize;

public class Venti extends ComponentSize {

    public Venti() {
        description = "Venti";
    }

    @Override
    public double cost() {
        return 0.20;
    }
}
