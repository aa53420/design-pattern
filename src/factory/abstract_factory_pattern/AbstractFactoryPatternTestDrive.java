package factory.abstract_factory_pattern;


import factory.abstract_factory_pattern.pizza.creator.ChicagoPizzaStore;
import factory.abstract_factory_pattern.pizza.creator.NYPizzaStore;
import factory.abstract_factory_pattern.pizza.creator.PizzaStore;
import factory.abstract_factory_pattern.pizza.product.Pizza;
import factory.abstract_factory_pattern.pizza.product.PizzaType;

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
