package template_method;

/**
 * 고수준 객체
 */
public abstract class CaffeineBeverage {

    /**
     * 템플릿 메서드
     * 알고리즘의 템플릿 역할
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    // 서브 클래스에게 위임
    abstract void brew();

    // 서브 클래스에게 위임
    abstract void addCondiments();

    void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }
}