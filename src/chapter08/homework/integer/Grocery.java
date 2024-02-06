package chapter08.homework.integer;

public class Grocery extends Product {
    public Grocery(String name, int price, double weight) {
        super(name, price, weight);
    }

    public int getPrice(){
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}
