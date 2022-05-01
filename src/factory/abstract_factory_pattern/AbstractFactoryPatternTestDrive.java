package factory.abstract_factory_pattern;


import factory.abstract_factory_pattern.store.ChicagoPizzaStore;
import factory.abstract_factory_pattern.store.NYPizzaStore;
import factory.abstract_factory_pattern.store.PizzaStore;
import factory.abstract_factory_pattern.pizza.Pizza;
import factory.abstract_factory_pattern.pizza.PizzaType;

public class AbstractFactoryPatternTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("=== Abstract Factory Pattern ===");

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");
    }
}
