package adapter.example_1;

public class MallardDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("꽥!");
    }

    @Override
    public void fly() {
        System.out.println("날고있어요!Duck");
    }
}
