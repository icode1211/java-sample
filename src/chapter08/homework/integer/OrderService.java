package chapter08.homework.integer;

import chapter08.homework.integer.util.Calculator;

public class OrderService {
    public static void main(String[] args) {
        Beauty cosmetic = new Beauty("cosmetic", 12000, 1.59);
        LargeAppliance tv = new LargeAppliance("tv", 35000, 10);
        Grocery grocery = new Grocery("grocery", 10000, 0.3);

        Product[] products = {cosmetic, tv, grocery};
        Cart cart = new Cart(products);
        int deliveryCharge = Calculator.getDeliveryCharge(cart.getTotalWeight(), cart.getTotalPrice());
        System.out.println("총 배송료: " + deliveryCharge);
    }
}
