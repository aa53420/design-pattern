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

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("\n" + " 에단 주문 " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("\n" + " 조엘 주문 " + pizza + "\n");
    }
}
