package BTL;

public class QuackCounter implements Quackable {
    private Quackable quack;
    private static int numberOfQuack;

    public QuackCounter(Quackable quack) {
        this.quack = quack;
    }

    public static int getQuack(){
        return numberOfQuack;
    }

    @Override
    public void quack() {
    quack.quack();
    numberOfQuack++;
    }

    @Override
    public DuckType getType() {
        return quack.getType();
    }

}
