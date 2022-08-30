package BTL;

public class DuckFactory extends AbtractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new ReadHeadDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

//    public Quackable create(DuckType type){
//        switch (type){
//            case MALLARDDUCK:
//                createMallardDuck();
//
//            case REDHEADDUCK:
//                createRedHeadDuck();
//
//            case GOOSE:
//                createGoose();
//            default:return null;
//
//        }
//    }
}
