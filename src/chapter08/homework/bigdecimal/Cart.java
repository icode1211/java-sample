package chapter08.homework.bigdecimal;

import chapter08.homework.bigdecimal.util.Calculator;

import java.math.BigDecimal;

public class Cart {
    final private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public BigDecimal getTotalPriceIncludeDiscount() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            BigDecimal price = product.price.subtract(product.getDiscountAmount());
            total = total.add(price);
        }
        return total;
    }

    public double getTotalWeight() {
        double weight = 0;
        for (Product product : products) {
            weight += product.weight;
        }
        return weight;
    }

    public BigDecimal calculateDeliveryCharge() {
        return Calculator.getDeliveryCharge(
                getTotalWeight(), getTotalPriceIncludeDiscount());
    }
}
