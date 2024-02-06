package chapter08.homework.integer;

public class Product implements Promotion {
    String name;
    int price;
    double weight;

    public Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
