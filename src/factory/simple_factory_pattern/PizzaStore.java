package factory.simple_factory_pattern;


import factory.simple_factory_pattern.pizza.Pizza;
import factory.simple_factory_pattern.pizza.PizzaType;
import factory.simple_factory_pattern.pizza.SimplePizzaFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
