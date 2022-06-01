package template_method;

public class BeverageTestDrive {
    public static void main(String[] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("=== tea ===");
        tea.prepareRecipe();

        System.out.println("=== coffee ===");
        coffee.prepareRecipe();
    }
}
