package chapter08.homework.integer.util;

public class Calculator {
    public static int getDeliveryCharge(double weight, int price) {
        // 무게 : 3키로 미만 1천, 3~10키로 미만 5천, 10키로 이상 1만
        int baseDeliveryCharge = getBaseDeliveryCharge(weight);

        // 가격
        if (price < 30000) {
            return baseDeliveryCharge;
        } else if (price < 100000) {
            return baseDeliveryCharge - 1000;
        }
        return 0;
    }

    private static int getBaseDeliveryCharge(double weight) {
        int deliveryCharge;
        if (weight < 3.0) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }
        return deliveryCharge;
    }
}
