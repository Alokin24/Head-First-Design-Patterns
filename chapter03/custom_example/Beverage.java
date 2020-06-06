package chapter03.custom_example;

public abstract class Beverage {

    private ComponentSize componentSize;

    public String description = "Uknown beverage";


    public String getDescription() {
        return componentSize.description + " " + description;
    }

    public abstract double cost();

    public double costWithSize() {
        return componentSize.cost() + this.cost();
    }

    public void setSize(ComponentSize componentSize) {
        this.componentSize = componentSize;
    }
    public ComponentSize getSize() {
        return componentSize;
    }

}
