package factory.abstract_factory_pattern.pizza.ingredient;

import factory.abstract_factory_pattern.pizza.ingredient.cheese.Cheese;
import factory.abstract_factory_pattern.pizza.ingredient.cheese.ReggianoCheese;
import factory.abstract_factory_pattern.pizza.ingredient.clam.Clam;
import factory.abstract_factory_pattern.pizza.ingredient.clam.FreshClam;
import factory.abstract_factory_pattern.pizza.ingredient.dough.Dough;
import factory.abstract_factory_pattern.pizza.ingredient.dough.ThinCrustDough;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.SlicedPepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.MarinaraSauce;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.Sauce;
import factory.abstract_factory_pattern.pizza.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
