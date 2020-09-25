package chapter04;

import chapter04.pizzas.Pizza;
import chapter04.stores.ChicagoPizzaStore;
import chapter04.stores.NYPizzaStore;
import chapter04.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
