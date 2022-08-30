package BTL;

public class ReadHeadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("ReadHeadDuck:    quack quack");

    }

    @Override
    public DuckType getType() {
        return DuckType.REDHEADDUCK;
    }
}
