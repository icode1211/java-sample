package chapter09.exception;

public class NullPointerExample {
    public static void main(String[] args) {
        exception();
    }

    private static void exception() {
        String str = null;
        int length = str.length(); // null 참조에 접근
    }
}
