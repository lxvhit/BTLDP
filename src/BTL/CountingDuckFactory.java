package BTL;

public class CountingDuckFactory extends AbtractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new ReadHeadDuck());
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounter (new GooseAdapter(new Goose()));
    }

}
