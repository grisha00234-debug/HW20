package HW;
public class Main1 {
    public static void main(String[] args) {
        MagicShop shop = new MagicShop();
        Swords sword = new Swords("Убица Орков", 70, 500);
        Staffs staff = new Staffs("Песнь Леса", 50, 300);
        Amulets amulet = new Amulets("Амулет силы", 15, 100);
        shop.addItem(sword);
        shop.addItem(staff);
        shop.addItem(amulet);
        shop.showItems();
        System.out.println("=== Использование предметов ===");
        shop.demonstrateItems();
        System.out.println("=== Продажа предмета ===");
        shop.sellItem("Песнь Леса");
        shop.takeCollect(amulet);
        shop.showItems();
    }
}
