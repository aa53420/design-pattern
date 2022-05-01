package factory.abstract_factory_pattern.pizza.ingredient;

import factory.abstract_factory_pattern.pizza.ingredient.cheese.Cheese;
import factory.abstract_factory_pattern.pizza.ingredient.clam.Clam;
import factory.abstract_factory_pattern.pizza.ingredient.dough.Dough;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.Sauce;
import factory.abstract_factory_pattern.pizza.ingredient.veggie.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
