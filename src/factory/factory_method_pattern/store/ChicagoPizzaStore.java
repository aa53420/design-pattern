package factory.factory_method_pattern.store;

import factory.factory_method_pattern.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;

        switch (pizzaType) {
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case PEPPERONI:
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleClamPizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = null;
        }

        return pizza;
    }
}
