package chapter12.quiz;

import java.util.function.IntSupplier;

public class LambdaExample {
    public static int method(int x, int y) {
        IntSupplier supplier = () -> {
            int a = x * 10;
            int result = a + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3, 5));
    }
}
