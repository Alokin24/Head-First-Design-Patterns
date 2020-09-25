package chapter04.stores;

import chapter04.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza;

        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
