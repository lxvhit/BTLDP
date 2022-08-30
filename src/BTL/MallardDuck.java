package BTL;

public class MallardDuck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Mallard:  quack quack");
    }

    @Override
    public DuckType getType() {
        return DuckType.MALLARDDUCK;
    }
}
