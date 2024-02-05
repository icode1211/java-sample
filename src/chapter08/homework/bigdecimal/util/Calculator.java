package chapter08.homework.bigdecimal.util;

import java.math.BigDecimal;

public class Calculator {
    public static final BigDecimal LOWER_PRICE = BigDecimal.valueOf(30000);
    public static final BigDecimal UPPER_PRICE = BigDecimal.valueOf(100000);

    public static final double LOWER_WEIGHT = 3.0;
    public static final double UPPER_WEIGHT = 10.0;

    public static BigDecimal getDeliveryCharge(double weight, BigDecimal price) {
        // 무게 : 3키로 미만 1천, 3~10키로 미만 5천, 10키로 이상 1만
        BigDecimal baseDeliveryCharge = getBaseDeliveryCharge(weight);

        // 가격 : 3만원 미만은 무게단위계산을 따름
        if (price.compareTo(LOWER_PRICE) < 0) {
            return baseDeliveryCharge;
        } else {
            if (price.compareTo(UPPER_PRICE) < 0) {
                return baseDeliveryCharge.subtract(BigDecimal.valueOf(1000));
            }
        }
        return BigDecimal.ZERO;
    }

    private static BigDecimal getBaseDeliveryCharge(double weight) {
        BigDecimal deliveryCharge;

        if (weight < LOWER_WEIGHT) {
            deliveryCharge = BigDecimal.valueOf(1000);
        } else {

            if (weight < UPPER_WEIGHT) {
                deliveryCharge = BigDecimal.valueOf(5000);
            } else {
                deliveryCharge = BigDecimal.valueOf(10000);
            }
        }
        return deliveryCharge;
    }
}
