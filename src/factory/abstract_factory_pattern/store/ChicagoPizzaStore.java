package factory.abstract_factory_pattern.store;

import factory.abstract_factory_pattern.pizza.*;
import factory.abstract_factory_pattern.pizza.ingredient.ChicagoPizzaIngredientFactory;
import factory.abstract_factory_pattern.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 치즈 피자");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 페퍼로니 피자");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 조개 피자");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("시카고 스타일 야채 피자");
                break;
            default:
                pizza = null;
        }

        return pizza;
    }
}
