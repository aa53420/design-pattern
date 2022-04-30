package factory.factory_method_pattern.pizza.creator;

import factory.factory_method_pattern.pizza.product.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {

        Pizza pizza;

        switch (pizzaType) {
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
            case CLAM:
                pizza = new NYStyleClamPizza();
                break;
            case PEPPERONI:
                pizza = new NYStylePepperoniPizza();
                break;
            default:
                pizza = null;
        }

        return pizza;
    }
}
