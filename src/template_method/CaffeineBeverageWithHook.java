package template_method;

/**
 * 고수준 객체
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * 템플릿 메서드
     * 알고리즘의 템플릿 역할
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    // 서브 클래스에게 위임
    abstract void brew();

    // 서브 클래스에게 위임
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    void pourInCup() {
        System.out.println("컵에 따릅니다.");
    }

    /*
     * 서브클래스에서 필요할 때, 오버라이드를 할 수 있는 Hook
     */
    boolean customerWantsCondiments(){
        return true;
    }
}