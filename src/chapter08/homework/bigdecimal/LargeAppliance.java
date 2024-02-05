package chapter08.homework.bigdecimal;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    public LargeAppliance(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    public BigDecimal getPrice(){
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
