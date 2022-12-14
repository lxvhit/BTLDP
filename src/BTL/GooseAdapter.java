package BTL;

public class GooseAdapter implements Quackable{
    public Goose goose;

    public GooseAdapter(Goose goose) {

        this.goose = goose;
    }

    @Override
    public void quack() {
     goose.hnok();
    }

    @Override
    public DuckType getType() {
        return DuckType.GOOSE;
    }
}
