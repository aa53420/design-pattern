package factory.abstract_factory_pattern.store;


import factory.abstract_factory_pattern.pizza.Pizza;
import factory.abstract_factory_pattern.pizza.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
