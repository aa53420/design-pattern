package factory.abstract_factory_pattern.pizza.ingredient;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return Dough.THIN_CRUST_DOUGH;
    }

    @Override
    public Sauce createSauce() {
        return Sauce.MARINARA;
    }

    @Override
    public Cheese createCheese() {
        return Cheese.REGGIANO;
    }

    @Override
    public List<Veggie> createVeggies() {
        List<Veggie> veggies = Arrays.asList(Veggie.GARLIC, Veggie.ONION, Veggie.MUSHROOM, Veggie.RED_PEPPER);
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return Pepperoni.SLICED_PEPPERONI;
    }

    @Override
    public Clam createClam() {
        return Clam.MUSSEL;
    }
}
