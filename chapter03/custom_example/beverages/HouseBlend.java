package chapter03.custom_example.beverages;

import chapter03.custom_example.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
