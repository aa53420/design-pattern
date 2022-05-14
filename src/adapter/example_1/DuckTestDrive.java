package adapter.example_1;

import java.util.ArrayList;
import java.util.List;

public class DuckTestDrive {

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList();

        Duck mallardDuck = new MallardDuck();
        ducks.add(mallardDuck);

        Duck wildTurkey = new TurkeyAdapter(new WildTurkey());
        ducks.add(wildTurkey);

        for(Duck duck : ducks){
            duck.quack();
        }
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
