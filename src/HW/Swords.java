package HW;
public class Swords extends MagicalItem implements Collectible {
    public Swords(String name, int level, int price) {
        super(name, level, price);
    }
    @Override
    public void getDescription() {
        System.out.println("Описание Меча:");
        System.out.println("Меч, выкованнный в далёких горах, обладающий огромной, но неуравляемой силой");
    }
    @Override
    public void use() {
        System.out.println("Вы попытались испытать " + getName());
        System.out.println("Вы его ели как поднимаете");
        System.out.println("Похоже, вам нужно стать сильнее, чтобы использовать его в бою");
    }
    @Override
    public void collect() {
        System.out.println("Вы решили оставить " + getName()+ " себе в коллекцию");
    }
}
