package decorator.coffee;

import decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
