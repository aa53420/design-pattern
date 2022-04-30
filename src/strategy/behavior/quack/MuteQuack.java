package strategy.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        // 아무소리를 내지 않는다.
        System.out.println("<< 조용~ >>");
    }
}
