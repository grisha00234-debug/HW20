package HW;
public class Staffs extends MagicalItem implements Collectible{
    public Staffs(String name, int level, int price) {
        super(name, level, price);
    }
    @Override
    public void use() {
        System.out.println("Вы попытались испытать " + getName());
        System.out.println("Вы берёте посох в руки и падаете от бессилия, из-за недостатка маны");
        System.out.println("Похоже, вам нужно стать сильнее, чтобы использовать его в бою");
    }
    @Override
    public void getDescription() {
        System.out.println("Описание Посоха:");
        System.out.println("Посох, сделанный эльфали тысячи лет назад, ещё работает :)");
    }
    @Override
    public void collect() {
        System.out.println("Вы решили оставить " + getName()+ " себе в коллекцию");
    }
}
