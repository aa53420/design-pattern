package factory.factory_method_pattern.store;

import factory.factory_method_pattern.pizza.Pizza;
import factory.factory_method_pattern.pizza.PizzaType;

public abstract class PizzaStore {

    public final Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
