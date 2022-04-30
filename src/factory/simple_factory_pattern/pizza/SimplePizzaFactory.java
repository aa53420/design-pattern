package factory.simple_factory_pattern.pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza;

        switch (pizzaType){
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case GREEK:
                pizza = new GreekPizza();
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            default:
                pizza = null;
        }

        return pizza;
    }
}
