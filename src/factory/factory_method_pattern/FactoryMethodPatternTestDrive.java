package factory.factory_method_pattern;

import factory.factory_method_pattern.store.ChicagoPizzaStore;
import factory.factory_method_pattern.store.NYPizzaStore;
import factory.factory_method_pattern.store.PizzaStore;
import factory.factory_method_pattern.pizza.Pizza;
import factory.factory_method_pattern.pizza.PizzaType;

public class FactoryMethodPatternTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("=== Factory Method Pattern ===");

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");
    }
}
