package chapter06.car;

public class CarExample {
    public static void main(String[] args) {
        Car sonata = new Car("benz", 300);
        sonata.setSpeed(-100);
        System.out.println(sonata.getSpeed());
    }
}
