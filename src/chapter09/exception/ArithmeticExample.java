package chapter09.exception;

/**
 * 1. divide
 */
public class ArithmeticExample {
    public static void main(String[] args) {
//        method();
    }

    private static void method() throws CustomException {
        // 예외 발생 가능성 있는 실행문
    }

    class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

}
