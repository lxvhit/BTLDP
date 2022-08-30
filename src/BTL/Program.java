package BTL;

public class Program {
    public static void main(String[] args) {

        DuckFactory ct = new DuckFactory();
        CountingDuckFactory df = new CountingDuckFactory();
        Quackable md = df.createMallardDuck();
        Quackable rhd = df.createRedHeadDuck();
        Quackable Goo = df.createGoose();
        Flock fl = new Flock("đàn vịt lớn");
        Flock fl1 = new Flock("đàn vịt nhỏ 1");
        Flock fl2 = new Flock("đàn vịt nhỏ 2");
        fl.add(md);
        fl.add(rhd);
        fl.add(Goo);
        fl.add(fl1);
        fl1.add(md);
        fl1.add(rhd);
        fl1.add(rhd);
        fl.add(fl2);
        fl2.add(Goo);
        fl.quack();
        System.out.println("Tổng số con trong cả đàn: " + QuackCounter.getQuack());
        System.out.println(fl.getFlockName() + ":");
        fl.countDuck();
        System.out.println(fl1.getFlockName() + ":");
        fl1.countDuck();
        System.out.println(fl2.getFlockName() + ":");
        fl2.countDuck();


    }
}
