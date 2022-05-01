package factory.abstract_factory_pattern.pizza;

import factory.abstract_factory_pattern.pizza.ingredient.cheese.Cheese;
import factory.abstract_factory_pattern.pizza.ingredient.clam.Clam;
import factory.abstract_factory_pattern.pizza.ingredient.dough.Dough;
import factory.abstract_factory_pattern.pizza.ingredient.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.pizza.ingredient.sauce.Sauce;
import factory.abstract_factory_pattern.pizza.ingredient.veggie.Veggie;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
