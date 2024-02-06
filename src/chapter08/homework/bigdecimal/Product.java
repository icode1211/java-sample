package chapter08.homework.bigdecimal;

import java.math.BigDecimal;

public class Product implements Promotion {
    String name;
    BigDecimal price;
    double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        return BigDecimal.ZERO;
    }
}
