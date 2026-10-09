package HW;
public class Amulets extends MagicalItem implements Collectible{
    public Amulets(String name, int level, int price) {
        super(name, level, price);
    }
    @Override
    public void getDescription() {
        System.out.println("Описание Амулета:");
        System.out.println("Амулет, сделан лучшими магами современности");
    }
    @Override
    public void use() {
        System.out.println("Вы попытались испытать " + getName());
        System.out.println("Вы надеваете амулет. Вас пробирает чувство силы и непобедимости, ну или почти непобедимости");
    }
    @Override
    public void collect() {
        System.out.println("Вы решили оставить " + getName()+ " себе в коллекцию");
    }
}

