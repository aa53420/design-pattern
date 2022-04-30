package factory.abstract_factory_pattern.pizza.product;

import factory.abstract_factory_pattern.pizza.product.ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<Veggie> veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    List<String> toppings = new ArrayList<>();

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
}
