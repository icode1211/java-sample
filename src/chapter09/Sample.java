package chapter09;

public class Sample {

    public static void main(String[] args) {
        int result;
        try {
            result = 3 / 0;
            finalMessage();
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("숫자는 0으로 나눌 수 없습니다. result=" + result);
        } finally {
            finalMessage();
        }
    }

    public static void finalMessage() {
        System.out.println("그럼 수고하세요.");
    }
}
