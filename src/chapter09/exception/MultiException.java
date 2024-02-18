package chapter09.exception;

public class MultiException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 30;
        int b = 0;

        if (b != 0) {
            arr[4] = a / b;   // ArrayIndexOutOfBoundsException, ArithmeticException
        }

        throw new ArithmeticException();
    }
}
