package HW;
import java.util.ArrayList;
import java.util.List;
public class MagicShop {
    private List<MagicalItem> items = new ArrayList<>();
    public void addItem(MagicalItem item) {
        items.add(item);
        System.out.println("Добавлен предмет: " + item.getName());
    }
    public void sellItem(String name) {
        for (MagicalItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                items.remove(item);
                System.out.println("Предмет " + name
                        + " продан за " + item.getPrice() + " золотых.");
                return;
            }
        }
        System.out.println("Предмет " + name + " не найден.");
    }
    public void showItems() {
        System.out.println("\n=== Ассортимент магазина ===");
        if (items.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        for (MagicalItem item : items) {
            item.getDescription();
        }
    }
    public void demonstrateItems() {
        for (MagicalItem item : items) {
            item.use();
        }
    }
    public void takeCollect(MagicalItem magicalItem){
            if (magicalItem instanceof Collectible) {
                ((Collectible) magicalItem).collect();
                items.remove(magicalItem);
            } else {
                System.out.println("Этот предмет нельзя собрать.");
            }
        }
    }


