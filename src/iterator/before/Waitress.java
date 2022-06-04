package iterator.before;

import java.util.List;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    /*
     * 메뉴에 있는 모든 항목 출력
     * 메뉴가 추가될 때 마다, 순환문 추가가 됨 (중복)
     */
    public void printMenu() {
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        System.out.println("=== 아침 메뉴 ===");
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);

            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + "\n");
        }

        System.out.println("=== 점심 메뉴 ===");
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];

            if (menuItem == null) {
                continue;
            }

            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + "\n");
        }
    }
}
