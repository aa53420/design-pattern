package factory.factory_method_pattern.pizza.creator;

import factory.factory_method_pattern.pizza.product.Pizza;
import factory.factory_method_pattern.pizza.product.PizzaType;

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
