package factory.factory_method_pattern.pizza.product;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "시카고 스타일 딥 디쉬 조개 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
