package chapter07.afternoon.polymorpism;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Predator lion = new Lion();
        zookeeper.feed(lion);

//        Tiger tiger = new Tiger();
        Predator tiger = new Tiger();
        zookeeper.feed(tiger);

        Predator zebra = new Zebra();
        zookeeper.feed(zebra);
    }
}
class Lion implements Predator {
    @Override
    public void feed() {
        System.out.println("feed fish");
    }
}
class Tiger implements Predator {
    @Override
    public void feed() {
        System.out.println("feed meat");
    }
}
class Zebra implements Predator {
    @Override
    public void feed() {
        System.out.println("feed ?");
    }
}
class Zookeeper {
    void feed(Predator predator) {
        predator.feed();
    }
}