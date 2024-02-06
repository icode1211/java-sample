package chapter08.homework;

import java.math.BigDecimal;

public class BigDecimalVSDouble {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;

        if (a + b == 0.3) {
            // but not invoked..
            System.out.println("여기 들어오나??");
        }

        System.out.println(a + b); // 0.30000000000000004

        BigDecimal a2 = BigDecimal.valueOf(0.1);
        BigDecimal b2 = BigDecimal.valueOf(0.2);
        BigDecimal addResult = a2.add(b2);
        if (addResult.equals(BigDecimal.valueOf(0.3))) {
            System.out.println("여기 들어오나??");
        }
        System.out.println(addResult);
    }
}
