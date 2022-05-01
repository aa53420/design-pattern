package factory.abstract_factory_pattern.pizza.ingredient;

import factory.abstract_factory_pattern.pizza.ingredient.cheese.Cheese;
import factory.abstract_factory_pattern.pizza.ingredient.cheese.MozzarellaCheese;
import factory.abstract_factory_pattern.pizza.ingredient.clam.Clam;
import factory.abstract_factory_pattern.pizza.ingredient.clam.FrozenClam;
import factory.abstract_factory_pattern.pizza.ingredient.dough.Dough;
import factory.abstract_factory_pattern.pizza.ingredient.dough.ThickCrustDough;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.SlicedPepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.PlumTomatoSauce;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.Sauce;
import factory.abstract_factory_pattern.pizza.ingredient.veggie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new BlackOlive(), new Spinach(), new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
