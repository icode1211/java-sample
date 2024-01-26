package chapter09;

public class DivideExceptionSample {
    void finalMessage() {
        System.out.println("그럼 수고하세요.");
    }

    public static void main(String[] args) {
        DivideExceptionSample sample = new DivideExceptionSample();
        int result;
        try {
            result = 5 / 0;
            sample.finalMessage();       // 이 코드는 실행되지 않는다.
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
        } finally {
            sample.finalMessage();    // 이곳에서는 예외와 상관없이 무조건 수행된다.
        }
    }
}
