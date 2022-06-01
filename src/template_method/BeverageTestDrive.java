package template_method;

public class BeverageTestDrive {
    public static void main(String[] args){
        Tea tea = new Tea();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("=== tea ===");
        tea.prepareRecipe();

        System.out.println("=== coffee ===");
        coffeeWithHook.prepareRecipe();
    }
}
