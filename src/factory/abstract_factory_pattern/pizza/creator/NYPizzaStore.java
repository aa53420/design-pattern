package factory.abstract_factory_pattern.pizza.creator;


import factory.abstract_factory_pattern.pizza.product.*;
import factory.abstract_factory_pattern.pizza.product.ingredient.NYPizzaIngredientFactory;
import factory.abstract_factory_pattern.pizza.product.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {

        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 치즈 피자");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 야채 피자");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 조개 피자");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("뉴욕 스타일 페퍼로니 피자");
                break;
            default:
                pizza = null;
        }

        return pizza;
    }
}
