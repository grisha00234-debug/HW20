package HW;

public abstract class MagicalItem {
    private String name;
    private int level;
    private int price;

    public MagicalItem(String name, int level, int price) {
        this.name = name;
        this.level = level;
        this.price = price;
    }
    public abstract void use();
    public abstract void getDescription();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
