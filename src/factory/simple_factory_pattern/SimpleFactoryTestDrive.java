package factory.simple_factory_pattern;


import factory.simple_factory_pattern.pizza.PizzaType;
import factory.simple_factory_pattern.store.PizzaStore;

public class SimpleFactoryTestDrive {

    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
