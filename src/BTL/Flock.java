package BTL;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<Quackable>();
    private String flockName;
    private int countMallardDuck;
    private int countRedHeadDuck;
    private int countGoose;

    //    public Flock(int countMallardDuck, int countRedHeadDuck, int countGoose) {
//        this.countMallardDuck = countMallardDuck;
//        this.countRedHeadDuck = countRedHeadDuck;
//        this.countGoose = countGoose;
//    }
    public Flock(String flockName) {
        this.flockName = flockName;

    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void countDuck() {
        int countFlock = 0;
//        for (Quackable qac : quackers) {
//            if (qac.getType() == DuckType.MALLARDDUCK) {
//                countMallardDuck++;
//            } else if (qac.getType() == DuckType.REDHEADDUCK) {
//                countRedHeadDuck++;
//            } else if(qac.getType() == DuckType.GOOSE){
//                countGoose++;
//            }
//            else {
//                countFlock++;
//            }
//
//        }
        Iterator<Quackable> IQ = iterator();
        while (IQ.hasNext()){
            switch (IQ.next().getType()){
                case MALLARDDUCK:
                    countMallardDuck++;
                    break;
                case REDHEADDUCK:
                    countRedHeadDuck++;
                    break;
                case GOOSE:
                    countGoose++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Số vịt trời: " + countMallardDuck);
        System.out.println("Số vịt cổ đỏ: " + countRedHeadDuck);
        System.out.println("Số ngỗng: " + countGoose);
        System.out.println("");
    }

    public String getFlockName() {
        return flockName;
    }

    public void setFlockName(String flockName) {
        this.flockName = flockName;
    }

    @Override
    public void quack() {
        for (Quackable quac : quackers) {
            quac.quack();
        }
    }


    @Override
    public DuckType getType() {
        return DuckType.FLOCK;
    }

    public Iterator<Quackable> iterator() {
        return new FlockIterator();
    }

    private class FlockIterator implements Iterator<Quackable> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < quackers.size();
        }

        @Override
        public Quackable next() {
            return quackers.get(index++);
        }
    }
}
